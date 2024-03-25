package ic1101;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ton106
 */
public class ton106 extends HttpServlet {
	private static final long serialVersionUID = 1L;

    
	
	//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter writer = response.getWriter();
		
		response.setContentType("text/html");
		
		writer.println("<hrml>");
		writer.println("<sameer>");
		writer.println("<hello world>");
	}

}
