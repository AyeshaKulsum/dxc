package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dxc.pms.dao.ProductDAOImpl;
import com.dxc.pms.dao.productDAO;

/**
 * Servlet implementation class GetAllProduct
 */
public class GetAllProduct extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAllProduct() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		productDAO productDAO = new ProductDAOImpl();
		
		
		response.getWriter().println("<h2>All Product : </h2>");
		response.getWriter().println(
				"<table border = 1><th>Product Id</th><th>Prodcut Name</th><th>Quantity on hand</th><th>Bill Amount</th>");

				for (int i = 0; i < productDAO.getAllProducts().size(); i++) {
				response.getWriter()
				.println("<tr><td>" + productDAO.getAllProducts().get(i).getProductId() + "</td><td>"
				+ productDAO.getAllProducts().get(i).getProductName() + "</td><td>"
				+ productDAO.getAllProducts().get(i).getQuantityOnHand() + "</td><td>"
				+ productDAO.getAllProducts().get(i).getBillAmount() + "</td></tr>");
				}

				response.getWriter().println("</table>");
		response.getWriter().println("<a href='Welcome'><button>M E N U</button></a>");
		
	}

}
