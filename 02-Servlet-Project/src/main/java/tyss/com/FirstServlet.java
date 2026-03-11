package tyss.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		
		//to provide response to the client(Browser)
				PrintWriter pw = res.getWriter();
				pw.print("<html>"
						+ "<body>"
						+ "<h1>This is a GenericServlet Response</h1>"
						+ "</body>"
						+ "</html>");
		// TODO Auto-generated method stub
		
	}

}
