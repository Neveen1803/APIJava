package Country;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;

/**
 * Servlet implementation class CountryServlet
 */
@WebServlet("/CountryServlet")
public class CountryServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String CountryName=request.getParameter("CountryName");
		System.out.println(CountryName);
		APIClass api=new APIClass();
		JSONArray arr=api.APIMethod(CountryName);
		response.getWriter().append(arr.toString());
		}

}
