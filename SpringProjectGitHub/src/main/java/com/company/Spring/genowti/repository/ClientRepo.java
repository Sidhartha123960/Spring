package com.company.Spring.genowti.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.company.Spring.genowti.Entity.Client;
public interface ClientRepo extends JpaRepository<Client, Integer> 
{	 }