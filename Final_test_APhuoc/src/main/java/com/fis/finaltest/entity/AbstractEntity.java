package com.fis.finaltest.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@MappedSuperclass
@Data
@Entity
public class AbstractEntity {

	@Id
	@GeneratedValue
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Column(name = "version", nullable = false)
	private int version;
	
	@Column(name = "createdAt", nullable = false)
	private LocalDateTime createdAt;
	
	@Column(name = "modifiedAt", nullable = false)
	private LocalDateTime modifiedAt;

}
