package com.dev.delta;

import org.apache.camel.Produce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

import com.dev.delta.accountt.Accountt;
import com.dev.delta.accountt.IAcountt;
import com.dev.delta.accountt.dao.ProductAccountRepository;
import com.dev.delta.accountt.entities.Product;
import com.dev.delta.dentic.Dentic;
import com.dev.delta.eventy.Eventy;
import com.dev.delta.fastbus.FastBus;
import com.dev.delta.gym.GYM;
import com.dev.delta.librarylab.LibraryLab;
import com.dev.delta.lifecare.LifeCare;
import com.dev.delta.managem.Managem;
import com.dev.delta.pharmalife.PharmaLife;
import com.dev.delta.stockbay.StockBay;
import com.dev.delta.uprecruit.UpRecruit;

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
   
   @Autowired
   FastBus fastBus;
   
   @Autowired
   StockBay stockBay;
   
   @Autowired
   GYM gym;
   
   @Autowired
   LibraryLab libraryLab;
   
   @Autowired
   LifeCare lifeCare;
   
   @Autowired
   PharmaLife pharmaLife;
   
   @Autowired
   Managem managem;
   
   @Autowired
   UpRecruit upRecruit;
   
	public static void main(String[] args) {
		SpringApplication.run(BackendAllApplicationsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	
	accountt.populate();
	dentic.populate();
	eventy.populate();
	fastBus.populate();
	stockBay.populate();
	gym.populate();
	libraryLab.populate();
	lifeCare.populate();
	pharmaLife.populate();
	managem.populate();
	upRecruit.populate();
	}

}
