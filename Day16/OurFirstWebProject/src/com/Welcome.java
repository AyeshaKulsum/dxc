package com;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Welcome
 */
public class Welcome extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Welcome() {
        super();
        
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
    int counter=0;
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String uname=request.getParameter("username");
		counter++;
		response.getWriter().println("<h1>Welcome to DXC,"+uname+"</h1>");
		response.getWriter().println("<h1>You are user number: </h1>"+counter);
		response.getWriter().println("<h1><a href='Productform.html'>Add Product</a></h1>");
		response.getWriter().println("<h1><a href='Search.html'>Get Product By Id</a></h1>");
		response.getWriter().println("<h1><a href='GetAllProduct'>Get All Product</a></h1>");
		response.getWriter().println("<h1><a href='DeleteProduct.html'>Delete Product</a></h1>");
		response.getWriter().println("<h1><a href='UpdateProduct.html'>Update Product</a></h1>");
		response.getWriter().println("<h1><a href='tc.html'>T and C</a></h1>");
	}

}
