package com.byteslounge.spring.tx.model;

import javax.persistence.*;

@Entity
@Table(name="MYUSER")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="MYUSER_SEQ")
	@SequenceGenerator(name="MYUSER_SEQ", sequenceName="MYUSER_SEQ", allocationSize=1)
	@Column(name="ID", nullable = false)
	private int id;
	
	@Column(name="USERNAME", nullable = false)
	private String username;
	
	@Column(name="NAME", nullable = false)
	private String name;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}
