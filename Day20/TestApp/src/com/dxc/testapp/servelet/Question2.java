package com.dxc.testapp.servelet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Question2
 */
public class Question2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Question2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String answer2= request.getParameter("answer2");
		String ans= request.getParameter("ans2");
		HttpSession session=request.getSession();
		
		int count =(int) (session.getAttribute("count")) ;
		if(answer2==ans)
		{
			count++;
			int a=count;
			session.setAttribute("a", a);
			RequestDispatcher dispatcher =request.getRequestDispatcher("Question3.jsp");
			dispatcher.include(request, response);
			
		}
		else
		{
			RequestDispatcher dispatcher =request.getRequestDispatcher("Question3.jsp");
			dispatcher.include(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
