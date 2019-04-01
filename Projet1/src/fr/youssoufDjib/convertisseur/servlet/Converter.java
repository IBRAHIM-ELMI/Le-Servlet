package fr.youssoufDjib.convertisseur.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Converter extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		req.getRequestDispatcher("WEB-INF/convert.jsp").forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String celcius = req.getParameter("celcius");
		float floatCelcius = Float.parseFloat(celcius);
		double result = (floatCelcius * (9 / 5)) + 32;
		req.setAttribute("result", result);
		req.getRequestDispatcher("WEB-INF/convert.jsp").forward(req, resp);
	}

}
