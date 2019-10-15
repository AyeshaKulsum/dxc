package com.dxc.testapp.servelet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class BeginServelet
 */
public class BeginServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BeginServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name= request.getParameter("name");
		HttpSession session=request.getSession();
		session.setAttribute("myname", name);
		response.getWriter().println("Instructions");
		response.getWriter().println("\nTotal : 3 Questions ");
		response.getWriter().println("\nTotal Marks : 30");
		response.getWriter().println("\n<a href='DisplayServelet'><button>Begin Test</button></a>");
		

		 
	}

}
