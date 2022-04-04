package com.fis.finaltest.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Person")
@Data
public class Person {

	@JoinColumn(name = "username")
	private String username;

	@JoinColumn(name = "firstName")
    private String firstName;

	@JoinColumn(name = "lastName")
    private String lastName;

	@JoinColumn(name = "password")
    private String password;

	@JoinColumn(name = "hiringDate")
    private LocalDateTime hiringDate;
}
