package com.jpa.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="cust")
public class Customer {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cid;
	public Customer(String name) {
		
		this.name = name;
	}
	private String name;
	@JoinColumn(name="pid_fk")
	@ManyToOne
	private Product product;
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Customer(String name, Product product) {
		
		this.name = name;
		this.product = product;
	}
	public Customer() {
		
	}
	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", name=" + name + "]";
	}
	

}
