package com.masai.model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Event {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer eventid;
	private String type;
	private String description;
	private Date startdate;
	private Date endDate;

}
