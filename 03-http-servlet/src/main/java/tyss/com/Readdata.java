package tyss.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/read")

public class Readdata  extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(req,resp);
		
		System.out.println("User Data");
		
		String s = null;
		s.charAt(0);
		
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String address = req.getParameter("addreaa");
		
		
		System.out.println(name);
		System.out.println(email);
		System.out.println(address);
		
	    resp.getWriter().print ("<html> user with name: "+name+"is register successfully </html>");

	}

}
