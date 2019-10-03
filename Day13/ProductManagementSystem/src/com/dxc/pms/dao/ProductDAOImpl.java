package com.dxc.pms.dao;

import java.util.ArrayList;
import java.util.List;

import com.dxc.pms.model.Product;

public class ProductDAOImpl implements productDAO {

	public ProductDAOImpl() {
		
	}
	List<Product> allProducts=new ArrayList<Product>();
	@Override
	public Product getProduct(int productId) {
		
		return null;
	}

	@Override
	public List<Product> getAllProducts() {
		
		return allProducts;
	}

	@Override
	public void addProduct(Product product) {
		allProducts.add(product);

	}

	@Override
	public void deleteProduct(int productID) {
		

	}

	@Override
	public void updateProduct(Product product) {
		

	}

}
