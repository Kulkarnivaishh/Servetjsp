package com.kiranacademy.servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//get data
		String UName=request.getParameter("UName");
		String Password=request.getParameter("Password");

		//process data
		System.out.println(UName);
		System.out.println(Password);

		//navigate
		if(UName.equals("Kiranacademy")) {
			//show all emp
			ArrayList<String> al=new ArrayList<String>();
			al.add("aaa");
			al.add("bbb");
			al.add("ccc");
			al.add("ddd");
			al.add("eee");
			request.setAttribute("data", al);
			RequestDispatcher dispatcher=request.getRequestDispatcher("inbox.jsp");
			dispatcher.forward(request, response);

		}else {
			//error message
			request.setAttribute("msg", "your password is wrong");
			RequestDispatcher dispatcher=request.getRequestDispatcher("error.jsp");
			dispatcher.forward(request, response);

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
