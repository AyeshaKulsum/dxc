package com.dxc.pms.dao;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dxc.pms.dbcon.DbConnection;
import com.dxc.pms.model.Product;

public class ProductDAOImpl implements productDAO {

	Connection connection = DbConnection.getConnection();
	private static final String FETCH_PRODUCT_ALL ="select * from product";
	public ProductDAOImpl() {
		
	}
	
	@Override
	public Product getProduct(int productId) {
		Product product = new Product();
		
		if(product.getProductId()==productId)
		{
			return product;
		}
		return product;
	}

	@Override
	public List<Product> getAllProducts() {
		
		List<Product> allProducts=new ArrayList<Product>();
		
		try {
			Statement stat = connection.createStatement();
			ResultSet res = stat.executeQuery(FETCH_PRODUCT_ALL);
			while(res.next())
			{
				Product product = new Product();
				product.setProductId(res.getInt(1));
				product.setProductName(res.getString(2));
				product.setQuantityOnHand(res.getInt(3));
				product.setPrice(res.getInt(4));
				allProducts.add(product);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allProducts;
		
	}

	@Override
	public void addProduct(Product product) {
		//allProducts.add(product);
		PreparedStatement stat;
		try {
			stat = connection.prepareStatement("insert into product value(?,?,?,?)");
			stat.setInt(1,product.getProductId());
			stat.setString(2,product.getProductName());
			stat.setInt(3,product.getQuantityOnHand());
			stat.setInt(4,product.getPrice());
			stat.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

	@Override
	public void deleteProduct(int productId) {
		//allProducts.removeIf(g-> g.getProductId()==productID);
		PreparedStatement stat;
		try {
			stat = connection.prepareStatement("delete product where productId=?");
			stat.setInt(1,productId );
			stat.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void updateProduct(Product product) {
		//for(int i=0;i<allProducts.size();i++)
	//	{
	//		if(product.getProductId()==allProducts.get(i).getProductId())
	///		{
	//			allProducts.set(i, product);
	//		}
	//	}

	}

}
