package com.company.Spring.genowti.Entity;

import javax.persistence.*;

@Entity
public class Client 
{
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
    
	@Column(name = "NAME" , unique = true)
	private String name;
	
	@Column(name = "LOCATION" , unique = true)
    private String location;
	
	@Column(name  = "PHONENUMBER" , unique = true)
	private String phonenumber;
	
	@Column(name = "ADDRESS" , unique = true)
    private String address;
	
	@Column(name = "ZIPCODE" , unique = true)
    private long zipcode;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public long getZipcode() {
		return zipcode;
	}

	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}

	@Override
	public String toString() 
	{
		return "Client [id=" + id + ", name=" + name + ", location=" + location + ", phonenumber=" + phonenumber
				+ ", address=" + address + ", zipcode=" + zipcode + "]";
	}	
}