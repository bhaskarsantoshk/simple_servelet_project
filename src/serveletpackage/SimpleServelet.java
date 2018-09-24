package serveletpackage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SimpleServelet
 */
@WebServlet(description = "A simple servelet", urlPatterns = { "/SimpleServeletPath" })
public class SimpleServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Hello from GET method. ");
		PrintWriter writer = response.getWriter();
		//writer.println("<h1> Hello in html </h1>");
		writer.println("Hello from Servelet GET method -on the web page");
	}

}
