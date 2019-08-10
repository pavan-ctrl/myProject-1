package com.jsp.servlet_chaining;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet
{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	resp.setContentType("text/html");
	PrintWriter pw = resp.getWriter();
	String user = req.getParameter("user");
	String pass = req.getParameter("pass");
	
	RequestDispatcher rd;
	if (user.equals("admin") && pass.equals("1234"))
	{
		/*
		rd=req.getRequestDispatcher("home.html");
		rd.forward(req, resp); */
		//resp.sendRedirect("home.html");
		resp.sendRedirect("https://www.facebook.com");
	}
	else 
	{
		pw.print("Login is Failed");
		rd=req.getRequestDispatcher("index.html");
		rd.include(req, resp);
	}
  }
}
