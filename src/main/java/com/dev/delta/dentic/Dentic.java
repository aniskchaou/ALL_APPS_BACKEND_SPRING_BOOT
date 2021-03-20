package com.dev.delta.dentic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.dentic.entities.Appointement;
import com.dev.delta.dentic.entities.Medicament;
import com.dev.delta.dentic.entities.Patient;
import com.dev.delta.dentic.entities.Prescription;
import com.dev.delta.dentic.services.AppointementService;
import com.dev.delta.dentic.services.MedicamentService;
import com.dev.delta.dentic.services.PatientService;
import com.dev.delta.dentic.services.PrescriptionService;

@Service
public class Dentic implements IDentic {
	@Autowired
   AppointementService appointementService;
	
   @Autowired
   MedicamentService medicamentService;
   
   @Autowired
   PatientService patientService;
   
   @Autowired
   PrescriptionService prescriptionService;
   
   
	@Override
	public void initAppointements()
	{
		appointementService.saveOrUpdate(new Appointement("12/2/2020", "anis", "crise", "sdf"));
	}
	
	@Override
	public void initMedicaments()
	{
		medicamentService.saveOrUpdate(new Medicament( "", "", "", ""));
	}
	
	@Override
	public void initPatients()
	{
		patientService.saveOrUpdate(new Patient("", "", "", "", "", "", "", "", ""));
	}
	
	@Override
	public void initPrescriptions()
	{
		prescriptionService.saveOrUpdate(new Prescription(""));
	}

	@Override
	public void populate() {
		initAppointements();
		initMedicaments();
		initPatients();
		initPrescriptions();
		
	}
}

