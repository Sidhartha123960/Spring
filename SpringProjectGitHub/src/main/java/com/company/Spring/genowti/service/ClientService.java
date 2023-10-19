package com.company.Spring.genowti.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.company.Spring.genowti.Entity.Client;
import com.company.Spring.genowti.repository.ClientRepo;
import java.util.*;

import java.io.*;


@Service
public class ClientService 
{
	  @Autowired
	  ClientRepo repo; 
	  
	  public Client getclient() throws IOException 
	  {  
		 System.out.println("Enter the name");
		 Scanner sc = new Scanner(System.in);
		 String name = sc.nextLine();
		 System.out.println("Enter the location"); 
		 String loc = sc.nextLine();
		 System.out.println("Enter the phonenumber");
		 String phone = sc.nextLine();
		 System.out.println("Enter the address");
		 String addr = sc.nextLine();
		 System.out.println("Enter the zipcode");
		 long zip = sc.nextLong();
         
		 File file = new File("C:\\Users\\LENOVO\\Desktop\\file operation\\index.txt");
		 if(!file.createNewFile())
		 {
			 FileWriter fw = new FileWriter(file); 
			 fw.write(name+" "+loc+"  "+phone+"  "+addr+"  "+zip); 
			 fw.close();
			 System.out.println("saved............");			 
		 }
		 else
		 {
			 System.out.println("not saved.....");
		 }
		 
		 Client c = new Client();
		 c.setName(name);
		 c.setLocation(loc);
		 c.setPhonenumber(phone);
		 c.setAddress(addr);
		 c.setZipcode(zip);	  
		          return repo.save(c);	    		        
	  }  		
}