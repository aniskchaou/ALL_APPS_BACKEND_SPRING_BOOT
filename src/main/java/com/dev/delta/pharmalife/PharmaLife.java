package com.dev.delta.pharmalife;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.dentic.entities.Medicament;
import com.dev.delta.dentic.services.MedicamentService;
import com.dev.delta.pharmalife.entities.BuyPharma;
import com.dev.delta.pharmalife.entities.CategoryPharma;
import com.dev.delta.pharmalife.entities.ClientPharma;
import com.dev.delta.pharmalife.entities.Constructor;
import com.dev.delta.pharmalife.entities.ServicePharma;
import com.dev.delta.pharmalife.entities.SupplierPharma;
import com.dev.delta.pharmalife.entities.Type;
import com.dev.delta.pharmalife.services.BuyPharmaService;
import com.dev.delta.pharmalife.services.CategoryPharmaService;
import com.dev.delta.pharmalife.services.ClientPharmaService;
import com.dev.delta.pharmalife.services.ConstructorService;
import com.dev.delta.pharmalife.services.ServicePharmaService;
import com.dev.delta.pharmalife.services.SupplierPharmaService;
import com.dev.delta.pharmalife.services.TypeService;

@Service
public class PharmaLife implements IPharmaLife{

	 @Autowired
	 BuyPharmaService  buyPharmaService;
	 
	 @Autowired
	 CategoryPharmaService categoryPharmaService;
	 
	 @Autowired
	 ClientPharmaService clientService;
	 
	 @Autowired
	 ConstructorService constructorService;
	 
	 @Autowired
	 MedicamentService medicamentService;
	 
	 @Autowired
	 ServicePharmaService servicePharmaService;
	 
	 @Autowired
	 SupplierPharmaService  supplierPharmaService;
	 
	 @Autowired
	 TypeService typeService;
	 
	@Override
	public void initBuy() {
		// TODO Auto-generated method stub
		buyPharmaService.saveOrUpdate(new BuyPharma(null, null, null, null, null, null));
	}

	@Override
	public void initCategories() {
		categoryPharmaService.saveOrUpdate(new CategoryPharma(null));
		
	}

	@Override
	public void initClients() {
		// TODO Auto-generated method stub
		clientService.saveOrUpdate(new ClientPharma(null, null, null, null, null, null));
	}

	@Override
	public void initConstructors() {
		// TODO Auto-generated method stub
		constructorService.saveOrUpdate(new Constructor(null, null, null, null, null, null, null, null, null, null));
	}

	@Override
	public void initMedicaments() {
		// TODO Auto-generated method stub
	medicamentService.saveOrUpdate(new Medicament(null, null, null, null))	;
	}

	@Override
	public void initServices() {
		// TODO Auto-generated method stub
	servicePharmaService.saveOrUpdate(new ServicePharma(null, null, null, null));	
	}

	@Override
	public void initSuppliers() {
		// TODO Auto-generated method stub
	supplierPharmaService.saveOrUpdate(new SupplierPharma(null, null, null, null, null));	
	}

	@Override
	public void iniyTypes() {
		// TODO Auto-generated method stub
	typeService.saveOrUpdate(new Type(null));
	}

	@Override
	public void populate() {
		// TODO Auto-generated method stub
		initBuy();
		initCategories();
		initClients();
		initConstructors();
		initMedicaments();
		initServices();
		initSuppliers();
		iniyTypes();
	}

}
