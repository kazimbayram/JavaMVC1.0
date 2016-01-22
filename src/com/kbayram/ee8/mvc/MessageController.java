package com.kbayram.ee8.mvc;

import javax.inject.Inject;
import javax.mvc.Controller;
import javax.mvc.Models;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.QueryParam;

@Controller
@Path("message")
public class MessageController {
	
	
	@Inject
	Models model;
	
	@GET
	@Path("{name}")
	public String giveMessage(@PathParam("name") String isim){
	    String message = "Hoşgeldiniz " + isim;
	    model.put("message", message);
		
		return "/message.jsp";
	}
}
