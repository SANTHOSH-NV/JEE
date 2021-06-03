package com.xworkz.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/login")
public class LogInServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

		String FirstName = req.getParameter("fn");
		String LastName = req.getParameter("ln");
		String MobileNo = req.getParameter("mNo");
		String e_mail = req.getParameter("e-mail");
		String City = req.getParameter("city");
		String Country = req.getParameter("coun");
		String Pincode = req.getParameter("pin");

		PrintWriter writer = res.getWriter();

		res.setContentType("text/html");
		writer.print("Confirm Your Name & Phone Num : " + FirstName +" "+ LastName +"; "+ MobileNo);
	}

}
