package com.dxc.pms.client;

import java.util.Scanner;

import com.dxc.pms.dao.ProductDAOImpl;
import com.dxc.pms.dao.productDAO;
import com.dxc.pms.model.Product;

public class ProductApp {
	productDAO productDAO;
	int productId;
	String productName;
	int quantityOnHand;
	int price;
	int choice = 0;
	Scanner scanner = new Scanner(System.in);
public ProductApp() {
	this.productDAO = new ProductDAOImpl();
}
public void launchAPP()
{
	while (true) {
		System.out.println("M E N U ");
		System.out.println("1. Add The products : ");
		System.out.println("2. Get All The products : ");
		System.out.println("3. Search product by id : ");
		System.out.println("4. Delete The product : ");
		System.out.println("5. Update The product : ");
		System.out.println("6. E X I T");
		
		
		System.out.println("Please enter your choice : (1-3)");
		choice = scanner.nextInt();

		switch (choice) {
		case 1:
			Product product = takeProductInput();

			productDAO.addProduct(product);
			break;
		case 2:

			System.out.println(productDAO.getAllProducts());
			break;
		case 3:
			System.out.println("Please enter product id to search");
			productId=scanner.nextInt();
			Product searchedProduct = productDAO.getProduct(productId);
			System.out.println(searchedProduct);
			break;
		case 4:
			System.out.println("Please enter product id to delete");
			productId=scanner.nextInt();
			productDAO.deleteProduct(productId);
			System.out.println("Product deleted successfully");
			break;
		case 5:
			System.out.println("Welcome to product app update");
			Product productToUpdate = takeProductInput();
			productDAO.updateProduct(productToUpdate);
			System.out.println("Your product updated successfully");
			break;
		case 6:
			System.out.println("Thanks for using my app");
			System.exit(0);
		default:
			System.out.println("Please enter (1-3)");
		}
	}
}
private Product takeProductInput() {
	System.out.println("Please enter product id :");
	productId = scanner.nextInt();
	System.out.println("Please enter product name :");
	productName = scanner.next();
	System.out.println("Please enter product quantity :");
	quantityOnHand = scanner.nextInt();
	System.out.println("Please enter product price :");
	price = scanner.nextInt();

	Product product = new Product(productId, productName, quantityOnHand, price);
	return product;
}

}
