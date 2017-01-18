package com.example;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * @author Ken Finnigan
 */
@Path("/")
@ApplicationScoped
public class EmployeeResource {

  @GET
  @Produces("application/json")
  public String[] get() {
    return generateEmployeeNameArray();
  }
  
  private static String[] generateEmployeeNameArray(){
	String[] names = {"frank","bernd","ralf"};
	return names;

  }
	  
}