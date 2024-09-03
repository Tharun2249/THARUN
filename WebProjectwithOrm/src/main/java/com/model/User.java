package com.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

@Entity
@Table(name="usertable")
public class User {

	@GeneratedValue
	private String id;
	private String uname;
	private String pass;
	private String mail;
	private String city;
}