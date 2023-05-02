package com.soft;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

@Path("/provider")
public class Service_Provider {
	
    @Path("/msg")
    @GET
	public String showMsg () {
		
		return "Welcome to RestAPI ";
	}
	
}
