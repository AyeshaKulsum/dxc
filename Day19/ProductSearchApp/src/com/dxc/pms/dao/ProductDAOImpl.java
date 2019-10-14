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
	private static final String FETCH_PRODUCT_By_Id ="select * from product where productId=?";
	private static final String INSERT_PRODUCT ="insert into product value(?,?,?,?)";
	private static final String DELETE_PRODUCT_By_Id ="delete from product where productId=?";
	private static final String UPDATE_PRODUCT_QUERY ="update product set productName=?, quantityOnHand=?,billAmount=? where productId=?";
	public ProductDAOImpl() {
		
	}
	
	@Override
	public Product getProduct(int productId) {
		Product product = new Product();
		
		PreparedStatement stat;
		try {
			
			stat = connection.prepareStatement(FETCH_PRODUCT_By_Id);
			stat.setInt(1,productId);
			ResultSet res=stat.executeQuery();
			
			res.next();
			
				product.setProductId(res.getInt(1));
				product.setProductName(res.getString(2));
				product.setQuantityOnHand(res.getInt(3));
				product.setBillAmount(res.getInt(4));	
			}
		 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
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
				product.setBillAmount(res.getInt(4));
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
			stat = connection.prepareStatement(INSERT_PRODUCT);
			stat.setInt(1,product.getProductId());
			stat.setString(2,product.getProductName());
			stat.setInt(3,product.getQuantityOnHand());
			stat.setInt(4,product.getBillAmount());
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
			stat = connection.prepareStatement(DELETE_PRODUCT_By_Id);
			stat.setInt(1,productId );
			stat.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateProduct(Product product) {
		
		
		try{

			PreparedStatement stat=connection.prepareStatement(UPDATE_PRODUCT_QUERY);
				
				stat.setString(1,product.getProductName());
				stat.setInt(2,product.getQuantityOnHand());
				stat.setInt(3,product.getBillAmount());
				stat.setInt(4,product.getProductId());
				
				stat.executeUpdate();
			}
			catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
	public boolean isProductExists(int productId)
	{
		boolean productExists=false;
		PreparedStatement preparedStatement;
		try
		{
		preparedStatement = connection.prepareStatement(FETCH_PRODUCT_By_Id);
		preparedStatement.setInt(1, productId);
		ResultSet res = preparedStatement.executeQuery();
		if(res.next())
		{
			productExists=true;
		}
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		return productExists;
	}
	

}
