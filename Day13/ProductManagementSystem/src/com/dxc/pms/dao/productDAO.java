package com.dxc.pms.dao;

import java.util.List;

import com.dxc.pms.model.Product;

public interface productDAO {
	public Product getProduct(int productId);
	public List<Product> getAllProducts();
	public void addProduct(Product product);
	public void deleteProduct(int pnrNumber);
	public void updateProduct(Product product);
}
