package com.company.Spring.genowti.MainController;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.company.Spring.genowti.Entity.Client;
import com.company.Spring.genowti.repository.ClientRepo;
import com.company.Spring.genowti.service.ClientService;

@RestController
public class DriveController 
{
 	  @Autowired
 	  ClientService service; 
	
 	  @GetMapping("/Client")
 	  public Client getclientdetails() throws IOException
 	  {
    	 Client c = service.getclient();
 		 return c;
 	  }	
}