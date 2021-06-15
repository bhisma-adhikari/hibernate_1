package com.code.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

// map this class with table category 

@Entity
@Table (name="category")
public class Category {
	// create the member variable and map with the column name of the table 
	@Id 
	@Column(name="catid")
	int catid; 
	
	@Column(name="name")
	String name;

	
	// constructors 

	public Category() {
		super();
		this.catid = 0;
		this.name = null;
	} 

	public Category(int catid, String name) {
		super();
		this.catid = catid;
		this.name = name;
	}

	
	// getters, setters 
	
	public int getCatid() {
		return catid;
	}

	public void setCatid(int catid) {
		this.catid = catid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Category [catid=" + catid + ", name=" + name + "]";
	} 
	
	
	
	
}
