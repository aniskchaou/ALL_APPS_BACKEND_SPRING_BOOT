package com.dev.delta.lifecare;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.lifecare.entities.AccountHospital;
import com.dev.delta.lifecare.entities.AppointementHospital;
import com.dev.delta.lifecare.entities.Departement;
import com.dev.delta.lifecare.entities.Doctor;
import com.dev.delta.lifecare.entities.Document;
import com.dev.delta.lifecare.entities.Employee;
import com.dev.delta.lifecare.entities.Insurance;
import com.dev.delta.lifecare.entities.PatientHospital;
import com.dev.delta.lifecare.entities.PaymentHospial;
import com.dev.delta.lifecare.entities.PrescriptionHospital;
import com.dev.delta.lifecare.entities.ScheduleHospital;
import com.dev.delta.lifecare.entities.ServiceHospital;
import com.dev.delta.lifecare.services.AccountHospitalService;
import com.dev.delta.lifecare.services.AppointementHospitalService;
import com.dev.delta.lifecare.services.DepartementService;
import com.dev.delta.lifecare.services.DoctorService;
import com.dev.delta.lifecare.services.DocumentService;
import com.dev.delta.lifecare.services.EmployeeService;
import com.dev.delta.lifecare.services.InsuranceService;
import com.dev.delta.lifecare.services.PatientHospitalService;
import com.dev.delta.lifecare.services.PaymentHospitalService;
import com.dev.delta.lifecare.services.PrescriptionHospitalService;
import com.dev.delta.lifecare.services.ScheduleHospitalService;
import com.dev.delta.lifecare.services.ServiceHospitalService;

@Service
public class LifeCare implements ILifeCare {

	@Autowired
	AccountHospitalService accountService;
	
	@Autowired
	AppointementHospitalService appointementHospitalService;
	
	@Autowired
	DepartementService  departementService;
	
	@Autowired
	DoctorService  doctorService;
	
	@Autowired
	DocumentService documentService;
	
	@Autowired
	EmployeeService employeeService;
	
	@Autowired
	InsuranceService InsuranceService;
	
	@Autowired
	PatientHospitalService patientHospitalService;
	
	@Autowired
	PaymentHospitalService  paymentHospitalService;
	
	@Autowired
	PrescriptionHospitalService prescriptionHospitalService;
	
	@Autowired
	ScheduleHospitalService scheduleHospitalService;
	
	@Autowired
	ServiceHospitalService serviceHospitalService;
	
	@Override
	public void initAccounts() {
		accountService.saveOrUpdate(new AccountHospital("", "", "", ""));
		
	}

	@Override
	public void initAppointements() {
		// TODO Auto-generated method stub
		appointementHospitalService.saveOrUpdate(new AppointementHospital("", "", "", "", "", ""));
	}

	@Override
	public void initDepartements() {
		// TODO Auto-generated method stub
	departementService.saveOrUpdate(new Departement("", "", ""))	;
	}

	@Override
	public void initDoctors() {
		// TODO Auto-generated method stub
	doctorService.saveOrUpdate(new Doctor("", "", "", "", "", "", "", "", "", "", "", "", "", ""))	;
	}

	@Override
	public void initDocuments() {
		// TODO Auto-generated method stub
	documentService.saveOrUpdate(new Document("", "", ""))	;
	}

	@Override
	public void initEmployees() {
		// TODO Auto-generated method stub
	employeeService.saveOrUpdate(new Employee("", "", "", "", "", "", "", "", ""))	;
	}

	@Override
	public void initInsurances() {
		// TODO Auto-generated method stub
	InsuranceService.saveOrUpdate(new Insurance("", "", "", "", "", "", "", "", "", "", "", ""));	
	}

	@Override
	public void initPatients() {
		// TODO Auto-generated method stub
		patientHospitalService.saveOrUpdate(new PatientHospital("", "", "", "", "", "", "", "", "", "", ""));
	}

	@Override
	public void initPayments() {
		// TODO Auto-generated method stub
		paymentHospitalService.saveOrUpdate(new PaymentHospial("", "", "", "", "", ""));
	}

	@Override
	public void initPrescriptions() {
		prescriptionHospitalService.saveOrUpdate(new PrescriptionHospital("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));
		
	}

	@Override
	public void initSchedules() {
		// TODO Auto-generated method stub
		scheduleHospitalService.saveOrUpdate(new ScheduleHospital("", "", "", "", "", "", ""));
	}

	@Override
	public void initServices() {
		// TODO Auto-generated method stub
		serviceHospitalService.saveOrUpdate(new ServiceHospital("", "", "", "", ""));
	}

	@Override
	public void populate() {
		// TODO Auto-generated method stub
		initAccounts();
		initAppointements();
		initDepartements();
		initDoctors();
		initDocuments();
		initEmployees();
		initInsurances();
		initPatients();
		initPayments();
		initPrescriptions();
		initSchedules();
		initServices();
	}

}
