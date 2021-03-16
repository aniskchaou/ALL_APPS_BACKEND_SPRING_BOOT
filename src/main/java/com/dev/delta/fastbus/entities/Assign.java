package com.dev.delta.fastbus.entities;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Assign {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String trip;
	String  fleet_registration_id;
	String   assign_date;
	String driver_id;
	String assistant_1;
	String  assistant_2;
	String assistant_3;
	String  status;
}
