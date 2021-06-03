package com.xworkz.register;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;


@WebServlet("/rs")
public class RegisterServlet extends GenericServlet {
	
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String name = req.getParameter("nm");
		String mobilenum = req.getParameter("mNo");
		String age = req.getParameter("age");
		String email = req.getParameter("e-mail");

		PrintWriter writer = res.getWriter();

		res.setContentType("text/html");
		writer.print("Thank You " + name);

	}

}
