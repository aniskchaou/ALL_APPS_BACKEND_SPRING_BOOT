package com.dev.delta.gym;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.gym.entities.Activity;
import com.dev.delta.gym.entities.Course;
import com.dev.delta.gym.entities.EventGYM;
import com.dev.delta.gym.entities.Expense;
import com.dev.delta.gym.entities.Groupe;
import com.dev.delta.gym.entities.MemberGYM;
import com.dev.delta.gym.entities.PaymentGYM;
import com.dev.delta.gym.entities.ProductGYM;
import com.dev.delta.gym.entities.RevenueGYM;
import com.dev.delta.gym.entities.Staff;
import com.dev.delta.gym.entities.TypeSub;
import com.dev.delta.gym.service.ActivityService;
import com.dev.delta.gym.service.CourseService;
import com.dev.delta.gym.service.EventGYMService;
import com.dev.delta.gym.service.ExerciceService;
import com.dev.delta.gym.service.ExpenseService;
import com.dev.delta.gym.service.GroupeService;
import com.dev.delta.gym.service.MemberGYMService;
import com.dev.delta.gym.service.PaymentService;
import com.dev.delta.gym.service.ProductGYMService;
import com.dev.delta.gym.service.RevenueGYMService;
import com.dev.delta.gym.service.StaffService;
import com.dev.delta.gym.service.TypeSubService;
import com.dev.delta.stockbay.services.ProductStockService;

@Service
public class GYM implements IGYM {

	@Autowired
	ActivityService activityService;
	
	@Autowired
	CourseService courseService;
	
	@Autowired
	EventGYMService eventService;
	
	@Autowired
	ExerciceService exerciceService;
	
	@Autowired
	ExpenseService expenseService;
	
	@Autowired
	GroupeService groupeService;
	
	@Autowired
	MemberGYMService memberService;
	
	@Autowired
	PaymentService paymentService;
	
	@Autowired
	ProductGYMService productService;
	
	@Autowired
	RevenueGYMService revenueService;
	
	@Autowired
	StaffService staffService;
	
	@Autowired
	TypeSubService typeService;
	
	
	
	
	
	
	
	
	@Override
	public void initActivities() {
		activityService.saveOrUpdate(new Activity("", "", "", "") );
		
	}

	@Override
	public void initCourses() {
		courseService.saveOrUpdate(new Course(""));
		
	}

	@Override
	public void initEvents() {
		eventService.saveOrUpdate(new EventGYM("", "", "", "", ""));
		
	}

	@Override
	public void initExpenses() {
		expenseService.saveOrUpdate(new Expense("", "", ""));
		
	}

	@Override
	public void initGroupes() {
		groupeService.saveOrUpdate(new Groupe(""));
		
	}

	@Override
	public void initMember() {
		memberService.saveOrUpdate(new MemberGYM("", "", "", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));
		
	}

	@Override
	public void initPayments() {
		paymentService.saveOrUpdate(new PaymentGYM("", "", "", "") );
		
	}

	@Override
	public void initProducts() {
		productService.saveOrUpdate(new ProductGYM("", "", ""));
		
	}

	@Override
	public void initRevenues() {
		revenueService.saveOrUpdate(new RevenueGYM("", "", "", "", ""));
		
	}

	@Override
	public void initStaffs() {
		staffService.saveOrUpdate(new Staff("", "", "", "", "", "", ""));
		
	}

	@Override
	public void initTypesubs() {
		typeService.saveOrUpdate(new TypeSub());
		
	}

	@Override
	public void populate() {
		initActivities();
		initCourses();
		initEvents();
		initGroupes();
		initMember();
		initPayments();
		initProducts();
		initRevenues();
		initStaffs();
		initTypesubs();
	}

}
