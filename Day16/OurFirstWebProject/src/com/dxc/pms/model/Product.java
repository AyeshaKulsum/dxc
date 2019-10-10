package com.dxc.pms.model;

public class Product {
	private int productId;
	private String productName;
	private int quantityOnHand;
	private int billAmount;
	public Product() {
		// TODO Auto-generated constructor stub
	}
	public Product(int productId, String productName, int quantityOnHand, int billAmount) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.quantityOnHand = quantityOnHand;
		this.billAmount = billAmount;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getQuantityOnHand() {
		return quantityOnHand;
	}
	public void setQuantityOnHand(int quantityOnHand) {
		this.quantityOnHand = quantityOnHand;
	}
	public int getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(int billAmount) {
		this.billAmount = billAmount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + billAmount;
		result = prime * result + productId;
		result = prime * result + ((productName == null) ? 0 : productName.hashCode());
		result = prime * result + quantityOnHand;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (billAmount != other.billAmount)
			return false;
		if (productId != other.productId)
			return false;
		if (productName == null) {
			if (other.productName != null)
				return false;
		} else if (!productName.equals(other.productName))
			return false;
		if (quantityOnHand != other.quantityOnHand)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "\nProduct [productId=" + productId + ", productName=" + productName + ", quantityOnHand=" + quantityOnHand
				+ ", billAmount=" + billAmount + "]";
	}

}
