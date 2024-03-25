package Com.Sathya.Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FullName")
public class FullName extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	

		//step-1 read the data
		String s1 = request.getParameter("Frist Name");
		String s2 = request.getParameter("Middile Name");
		String s3 = request.getParameter("Last Name");
		
		//step-2 process the data
		String Status;
			Status = s1+" "+s2+" "+s3;
		
		//render the response
		PrintWriter Writer = response.getWriter();
		response.setContentType("text/html");
		Writer.println("<html>");
		Writer.println("<h1>Full Name....</h1>"+Status);
		Writer.println("</html>");
	}
}
