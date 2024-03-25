package ic1101;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ton106
 */
public class ton106 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		
		response.setContentType("text/html");
		
		writer.println("<html>");
		
		writer.println("<h2>sameer<h2>");
		writer.println("<h1>apsar</h1>");
		writer.println("<h2>sana<h2>");
		
		
	}

}
