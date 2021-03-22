package com.dev.delta.fastbus;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dev.delta.fastbus.entities.Assign;
import com.dev.delta.fastbus.entities.Booking;
import com.dev.delta.fastbus.entities.Destination;
import com.dev.delta.fastbus.entities.Offer;
import com.dev.delta.fastbus.entities.Passenger;
import com.dev.delta.fastbus.entities.Price;
import com.dev.delta.fastbus.entities.Route;
import com.dev.delta.fastbus.entities.Schedule;
import com.dev.delta.fastbus.entities.Travel;
import com.dev.delta.fastbus.service.AssignService;
import com.dev.delta.fastbus.service.BookingService;
import com.dev.delta.fastbus.service.DestinationService;
import com.dev.delta.fastbus.service.OfferService;
import com.dev.delta.fastbus.service.PassengerService;
import com.dev.delta.fastbus.service.PriceService;
import com.dev.delta.fastbus.service.RouteService;
import com.dev.delta.fastbus.service.ScheduleService;
import com.dev.delta.fastbus.service.TravelService;


@Service
public class FastBus implements IFastBus {
   
	@Autowired
	AssignService assignService;
	
	@Autowired
	BookingService bookingService;
	
	@Autowired
	DestinationService destinationService;
	
	@Autowired
	OfferService offerService;
	
	@Autowired
	PassengerService passengerService;
	
	@Autowired
	PriceService priceService;
	
	@Autowired
	RouteService routeService;
	
	@Autowired
	ScheduleService scheduleService;
	
	@Autowired
	TravelService travelService;
	
	
	@Override
	public void initAssigns() {
	assignService.saveOrUpdate(new Assign("", "", "", "", "", "", "", ""));
		
	}

	@Override
	public void initBokings() {
		bookingService.saveOrUpdate(new Booking("", "", "", "", "", "", "", "", "", "", "", "", "", "", ""));
		
	}

	@Override
	public void initDestinations() {
		destinationService.saveOrUpdate(new Destination("", ""));
		
	}

	@Override
	public void initOffers() {
		offerService.saveOrUpdate(new Offer("", "", "", "", "", "", "", ""));
		
	}

	@Override
	public void initPassengers() {
		passengerService.saveOrUpdate(new Passenger("", "", "", "", "", "", ""));
		
	}

	@Override
	public void initPrices() {
		priceService.saveOrUpdate(new Price("", "", "", "", "", ""));
		
	}

	@Override
	public void initRoutes() {
		routeService.saveOrUpdate(new Route("", "", "", "", "", "", "", ""));
		
	}

	@Override
	public void initSchedules() {
		scheduleService.saveOrUpdate(new Schedule("", "", ""));
		
	}

	@Override
	public void initTravels() {
		travelService.saveOrUpdate(new Travel("", "", "", "", "", ""));
		
	}

	@Override
	public void populate() {
		initAssigns();
		initBokings();
		initDestinations();
		initOffers();
		initPassengers();
		initPrices();
		initRoutes();
		initSchedules();
		initTravels();
		
	}


	
}
