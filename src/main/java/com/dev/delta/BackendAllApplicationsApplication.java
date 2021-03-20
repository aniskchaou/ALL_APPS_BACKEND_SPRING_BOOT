package com.dev.delta;

import org.apache.camel.Produce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.dev.delta.accountt.Accountt;
import com.dev.delta.accountt.IAcountt;
import com.dev.delta.accountt.dao.ProductRepository;
import com.dev.delta.accountt.entities.Product;
import com.dev.delta.dentic.Dentic;
import com.dev.delta.eventy.Eventy;

@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class,
        org.springframework.boot.actuate.autoconfigure.security.servlet.ManagementWebSecurityAutoConfiguration.class})
public class BackendAllApplicationsApplication implements CommandLineRunner {

   @Autowired
   Accountt accountt;
   
   @Autowired
   Dentic dentic;
   
   @Autowired
   Eventy eventy;
   
	public static void main(String[] args) {
		SpringApplication.run(BackendAllApplicationsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
	accountt.populate();
	dentic.populate();
	eventy.populate();
	
	}

}
