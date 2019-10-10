package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dxc.pms.dao.ProductDAOImpl;
import com.dxc.pms.dao.productDAO;

/**
 * Servlet implementation class getProudctById
 */
public class getProudctById extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getProudctById() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		productDAO productDAO = new ProductDAOImpl();
		int id=Integer.parseInt(request.getParameter("searchproductId"));
		response.getWriter().println("<h2>Searched Product :" + productDAO.getProduct(id) + "</h2>");
		response.getWriter().println("<a href='Search.html'><button>Search Another Product</button></a>");
		response.getWriter().println("<a href='Welcome'><button>M E N U</button></a>");
	}

}
