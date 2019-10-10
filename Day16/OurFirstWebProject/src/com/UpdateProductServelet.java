package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dxc.pms.dao.ProductDAOImpl;
import com.dxc.pms.dao.productDAO;
import com.dxc.pms.model.Product;

/**
 * Servlet implementation class UpdateProductServelet
 */
public class UpdateProductServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateProductServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		productDAO productDAO = new ProductDAOImpl();
		int productId = Integer.parseInt(request.getParameter("productId"));
		String productName = request.getParameter("productName");
		int quantityOnHand = Integer.parseInt(request.getParameter("quantityOnHand"));
		int billAmount = Integer.parseInt(request.getParameter("billAmount"));
		Product product = new Product(productId, productName, quantityOnHand, billAmount);
		productDAO.updateProduct(product);
		response.getWriter().println("<h1>Product Updated successfully</h1>");
		response.getWriter().println("<a href='Welcome'><button>M E N U</button></a>");
	}

}
