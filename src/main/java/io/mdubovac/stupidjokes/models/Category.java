package io.mdubovac.stupidjokes.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "categories")
public class Category {
	@Id
	private long id;
	private String name;
	
	// Constructors
	public Category() {
	
	}
	public Category(long id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	// Getters & Setters
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
}
