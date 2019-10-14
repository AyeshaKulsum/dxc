package com.dxc.pms.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dxc.pms.dao.ProductDAOImpl;
import com.dxc.pms.dao.productDAO;
import com.dxc.pms.model.Product;

/**
 * Servlet implementation class ProductController
 */
public class ProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String option = request.getParameter("option");
		if(option.equals("2"))
		{
			displayAll(request,response);
		}
		else
		{
			productDAO productDAO = new ProductDAOImpl();
			List<Product> allProducts = productDAO.getAllProducts();
			HttpSession session = request.getSession();
			session.setAttribute("searchedProduct", allProducts);
			RequestDispatcher dispatcher = request.getRequestDispatcher("SearchResult.jsp");
			dispatcher.forward(request, response);
		}
	
	}

	private void displayAll(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		RequestDispatcher dispatcher = request.getRequestDispatcher("result2.jsp");
		dispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Retreieve the product id enetedrd
				int productId = Integer.parseInt(request.getParameter("productID"));
				Product product = new Product();
				productDAO productDAO = new ProductDAOImpl();
				product = productDAO.getProduct(productId);
				HttpSession session = request.getSession();
				if (product.getProductName() == null) {
					session.setAttribute("searchedProduct", "No record with product id :"+productId+ " exists");
				}
				else
				{
					session.setAttribute("searchedProduct", product);
				}
				RequestDispatcher dispatcher = request.getRequestDispatcher("SearchResult.jsp");
				dispatcher.forward(request, response);
	}

}