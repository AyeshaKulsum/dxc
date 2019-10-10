package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dxc.pms.dao.ProductDAOImpl;
import com.dxc.pms.model.Product;

/**
 * Servlet implementation class DisplayDetails
 */
public class DisplayDetails extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DisplayDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int productId = Integer.parseInt(request.getParameter("productId"));
		String productName = request.getParameter("productName");
		int quantityOnHand = Integer.parseInt(request.getParameter("quantityOnHand"));
		int billAmount = Integer.parseInt(request.getParameter("billAmount"));
		response.getWriter().println("<h1>Product Added successfully</h1>");
		response.getWriter().println("<h2>Product Id :" + productId + "</h2>");
		response.getWriter().println("<h2>Product Name :" + productName + "</h2>");
		response.getWriter().println("<h2>quantityOnHand :" + quantityOnHand + "</h2>");
		response.getWriter().println("<h2>billAmount :" + billAmount + "</h2>");

		Product product = new Product(productId, productName, quantityOnHand, billAmount);
		com.dxc.pms.dao.productDAO productDAO = new ProductDAOImpl();
		productDAO.addProduct(product);
		response.getWriter().println("<a href='Welcome'><button>M E N U</button></a>");

	}

}
