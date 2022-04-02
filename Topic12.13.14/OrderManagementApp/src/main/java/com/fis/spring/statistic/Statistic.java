package com.fis.spring.statistic;

public class Statistic {
	private long productCount;
	private long customerCount;
	private long orderCount;
	public long getProductCount() {
		return productCount;
	}
	public void setProductCount(long productCount) {
		this.productCount = productCount;
	}
	public long getCustomerCount() {
		return customerCount;
	}
	public void setCustomerCount(long customerCount) {
		this.customerCount = customerCount;
	}
	public long getOrderCount() {
		return orderCount;
	}
	public void setOrderCount(long orderCount) {
		this.orderCount = orderCount;
	}
	@Override
	public String toString() {
		return "Statistic [productCount=" + productCount + ", customerCount=" + customerCount + ", orderCount="
				+ orderCount + "]";
	}
	
	
}
