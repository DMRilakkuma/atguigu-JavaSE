package com.atgugui.exer4;

public class Order {
	
	int orderld;
	String orderName;
	public int getOrderld() {
		return orderld;
	}
	public void setOrderld(int orderld) {
		this.orderld = orderld;
	}
	public String getOrderName() {
		return orderName;
	}
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}
	public Order() {
		super();
	}
	public Order(int orderld, String orderName) {
		super();
		this.orderld = orderld;
		this.orderName = orderName;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		if (orderName == null) {
			if (other.orderName != null)
				return false;
		} else if (!orderName.equals(other.orderName))
			return false;
		if (orderld != other.orderld)
			return false;
		return true;
	}
	
	

}
