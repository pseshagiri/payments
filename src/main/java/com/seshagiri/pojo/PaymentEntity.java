package com.seshagiri.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity()
@Table(name = "payments")
public class PaymentEntity {
	
	@Id()
	private int id;
	@Column(name="productname")
	private String productName;
	@Column(name="billamount")
	private double billamount;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getBillamount() {
		return billamount;
	}
	public void setBillamount(double billamount) {
		this.billamount = billamount;
	}
	public PaymentEntity(int id, String productName, double billamount) {
		super();
		this.id = id;
		this.productName = productName;
		this.billamount = billamount;
	}
	public PaymentEntity() {}
}
