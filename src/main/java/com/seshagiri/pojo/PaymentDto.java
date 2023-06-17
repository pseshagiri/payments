package com.seshagiri.pojo;

import java.io.Serializable;

public class PaymentDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7516285142226910292L;
	
	private int id;
	private String productName;
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
	public PaymentDto(int id, String productName, double billamount) {
		super();
		this.id = id;
		this.productName = productName;
		this.billamount = billamount;
	}
	
	public PaymentDto() {}
	

}
