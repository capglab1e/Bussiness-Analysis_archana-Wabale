package com.cg.capstore.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Capstore_Revenue")
public class CapStoreRevenue {

	@Id
	@Column(name="order_id", length=10)
	private int orderId;
	
	@Column(name="revenue", length=10)
	private int revenue;
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public int getRevenue() {
		return revenue;
	}
	public void setRevenue(int revenue) {
		this.revenue = revenue;
	}
	
	public CapStoreRevenue(int orderId, int revenue) {
		super();
		this.orderId = orderId;
		this.revenue = revenue;
	}
	
	public CapStoreRevenue() {
		super();
	}
	
	@Override
	public String toString() {
		return "CapStoreRevenue [orderId=" + orderId + ", revenue=" + revenue
				+ "]";
	}

	
	
	
}
