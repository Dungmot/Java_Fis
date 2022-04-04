package com.fis.finaltest.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Detective")
@Data
public class Detective {
	@OneToOne
    @JoinColumn(name = "person")
    private Person person;
	
	@Column(name = "badgeNumber")
	private String badgeNumber;
	
	public enum Rank{
        TRAINEE, JUNIOR, SENIOR, INSPECTOR, CHIEF_INSPECTOR
    }
	@Enumerated
    private Rank ranking;
	
	@Column(name = "armed")
	private Boolean armed;
	
    public enum EmploymentStatus{
        ACTIVE, SUSPENDED, VACATION, UNDER_INVESTIGATION, RETIRED
    }
    @Enumerated
    private EmploymentStatus status;

    @ManyToMany(mappedBy = "assigned", fetch = FetchType.LAZY)
    private Set<CriminalCase> criminalCases;

    @OneToMany(mappedBy = "detective", fetch = FetchType.LAZY)
    private Set<TrackEntry> trackEntries;
}
