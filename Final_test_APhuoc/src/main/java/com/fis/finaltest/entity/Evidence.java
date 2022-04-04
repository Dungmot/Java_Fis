package com.fis.finaltest.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fis.finaltest.entity.CriminalCase.CaseStatus;
import com.fis.finaltest.entity.CriminalCase.CaseType;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Evidence")
@Data
public class Evidence {
	@ManyToOne
	@JoinColumn(name = "criminalCase")
	private CriminalCase criminalCase;

	@ManyToOne
	@JoinColumn(name = "storage")
	private Storage storage;

	@JoinColumn(name = "number")
	private String number;

	@JoinColumn(name = "itemName")
	private String itemName;

	@JoinColumn(name = "notes")
	private String notes;

	@JoinColumn(name = "archived")
	private Boolean archived;

	@OneToMany(mappedBy = "evidence")
	private Set<TrackEntry> trackEntries;
}
