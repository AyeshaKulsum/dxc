package com.dxc.pms.client;

import java.util.Scanner;
import com.dxc.pms.dao.ProductDAOImpl;
import com.dxc.pms.dao.productDAO;
import com.dxc.pms.model.Product;

public class Main {

	public Main() {
		// TODO Auto-generated constructor stub
	}
	productDAO productDAO = new ProductDAOImpl();
	public static void main(String[] args) {
		
ProductApp productApp =new ProductApp();
productApp.launchAPP();

	}

}