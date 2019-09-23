package com.buddhika;

import java.io.IOException;
import java.io.PrintWriter;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddServlet
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
      
	@EJB
	AddEjb addejb;
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter printwriter=response.getWriter();
		
		
		int enteredNum1 =  Integer.parseInt(request.getParameter("num1"));
		int enteredNum2 =  Integer.parseInt(request.getParameter("num2"));
		
		addejb.setNumber1(enteredNum1);
		addejb.setNumber2(enteredNum2);
		int total= addejb.sum();
		
		request.setAttribute("total", total);
	    request.getRequestDispatcher("/sum.jsp").forward(request, response);
	
	}

}
