package com;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicUpdate;

import lombok.Data;

@Entity   
@Table(name="student_p")
@DynamicUpdate 
@Data
public class StudentModel {

	@Id    
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "s_name")
	private String name;
	@Column(name="s_city")
	private String city;

	private int std;
	
	private int enroll;    


	
}
