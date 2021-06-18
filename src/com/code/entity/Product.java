package com.code.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity 
@Table (name="product")
public class Product {
	// create member variables 
	// map member variables with table columns 
	// create a relationship 
	// constructor 
	// getter and setter 
	// toString() 
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // auto-generated 
	@Column(name="id")
	int productid; 
	
	@Column(name="productname")
	String name; 
	
	@Column(name="price")
	double price; 
	
	// create relationship with the table called Category 
//	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, 
//			CascadeType.DETACH, CascadeType.REFRESH}) 
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinTable(name="category", joinColumns = @JoinColumn(name="catid"))
	Category cat; 
}
