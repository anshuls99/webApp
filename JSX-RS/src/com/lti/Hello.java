package com.lti;

import javax.ws.rs.GET;  
import javax.ws.rs.Path;  
import javax.ws.rs.Produces;  
import javax.ws.rs.core.MediaType;  

@Path("/hello")  
public class Hello {
	// This method is called if HTML and XML is not requested  
	@GET  
	  @Produces(MediaType.TEXT_PLAIN)  
	  public String sayPlainTextHello() {  
	    return "Hello Jersey Plain";  
	  } 
	
	@GET  
	  @Produces(MediaType.TEXT_HTML)  
	public String sayHTMLHello() {
		return "<HTML>"+"<title>" + "Hello Jersey" + "</title>" + "<body>h1>" + "Hello Jersey HTML" + "</h1></body>" + "</html>";
	}
	
	@GET  
	  @Produces(MediaType.TEXT_XML)  
	public String sayXMLHello() {
		return "<?xml version=\"1.0\"?>" +"<hello>Hello Jersey XML" + "</hello>";
	}
}
