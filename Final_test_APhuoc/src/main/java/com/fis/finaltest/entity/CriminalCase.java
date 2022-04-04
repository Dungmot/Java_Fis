package com.fis.finaltest.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CriminalCase")
@Data
public class CriminalCase {
	
	@Column(name = "number", nullable = false)
	private String number;
	
	public enum CaseType{
        UNCATEGORIZED, INFRACTION, MISDEMEANOR, FELONY
    }
	@Enumerated
	private CaseType type;
	
	@Column(name = "shortDescription")
	private String shortDescription;
	
	@Column(name = "detailedDescription")
	private String detailedDescription;
	
	public enum CaseStatus{
        SUBMITTED, UNDER_INVESTIGATION, IN_COURT, CLOSED, DISMISSED, COLD
    }
	@Enumerated
	private CaseStatus status;
	
	@Column(name = "notes")
	private String notes;
	
	@OneToMany(mappedBy = "criminalCase")
    private Set<Evidence> evidenceSet;

    @ManyToOne
    @JoinColumn(name = "leadInvestigator")
    private Detective leadInvestigator;

    private Set<Detective> assigned;

}
