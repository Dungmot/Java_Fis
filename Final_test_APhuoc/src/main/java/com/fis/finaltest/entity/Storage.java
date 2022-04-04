package com.fis.finaltest.entity;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Storage")
@Data
public class Storage {

	@JoinColumn(name = "name")
	private String name;

	@JoinColumn(name = "location")
    private String location;

    @OneToMany(mappedBy = "storage")
    private Set<Evidence> evidenceSet;
}
