package fr.youssoufDjib.convertisseur.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.youssoufDjib.convertisseur.user.User;

public class LoginServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
	req.getRequestDispatcher("WEB-INF/login.jsp").forward(req, resp);
	System.out.println("LoginServlet - doGet");
	
		/*PrintWriter out = resp.getWriter();
	out.println("<html><head><title>Bonjour</title></head><body><h1>Bonjour tout le monde</h1></body></html>");
	*/
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		
		System.out.println("LoginServlet - doPost");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		System.out.println("Email:" +email+ " Password: " +password);
		
		if(email.equals("yous-souf@gmail.com") && password.equals("1234")) {
		System.out.println("Authentification reussit");
		req.getSession().setAttribute("user", new User(email, password));
		resp.sendRedirect("convert");
		}
		else {
			System.out.println("Authentification echoué");
			resp.sendRedirect("login");
		}
	}

/*
@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) 
			throws ServletException, IOException {
		System.out.println("LoginServlet - Service Methode");
	}*/


}
