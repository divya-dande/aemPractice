package aemPractice.core.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;

import org.apache.felix.scr.annotations.sling.SlingServlet;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.SlingHttpServletResponse;
import org.apache.sling.api.servlets.SlingSafeMethodsServlet;


@SlingServlet(paths="/bin/profile-details")
public class ProfileDetails extends SlingSafeMethodsServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(SlingHttpServletRequest request, SlingHttpServletResponse response)
			throws ServletException, IOException {
		
		response.setContentType("application/json");
		PrintWriter printWriter=response.getWriter();
	    printWriter.write("{\"course\":[{\"id\":3,\"information\":\"test\",\"name\":\"course1\"}],\"name\":\"student\"}");
			
	}

}
