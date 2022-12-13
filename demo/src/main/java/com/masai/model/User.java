package com.masai.model;

import java.time.LocalDate;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
	@Id
	private String email;
	@Pattern(regexp = "[a-z]*")
	private String firstname;
	private String lastname;
	
	private String mobile;
	@Past
	private java.sql.Date dateofbirth;

}
