package com.dev.delta.fastbus.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="fastbus_route")
public class Route {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String    name;
	String      start_point;
	String      end_point;
	String      stoppage_points;
	String      distance;
	String      approximate_time;
	String      special_seat;
	String      status;
	
	public Route() {
		// TODO Auto-generated constructor stub
	}

	public Route(String name, String start_point, String end_point, String stoppage_points, String distance,
			String approximate_time, String special_seat, String status) {
		super();
		this.name = name;
		this.start_point = start_point;
		this.end_point = end_point;
		this.stoppage_points = stoppage_points;
		this.distance = distance;
		this.approximate_time = approximate_time;
		this.special_seat = special_seat;
		this.status = status;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStart_point() {
		return start_point;
	}

	public void setStart_point(String start_point) {
		this.start_point = start_point;
	}

	public String getEnd_point() {
		return end_point;
	}

	public void setEnd_point(String end_point) {
		this.end_point = end_point;
	}

	public String getStoppage_points() {
		return stoppage_points;
	}

	public void setStoppage_points(String stoppage_points) {
		this.stoppage_points = stoppage_points;
	}

	public String getDistance() {
		return distance;
	}

	public void setDistance(String distance) {
		this.distance = distance;
	}

	public String getApproximate_time() {
		return approximate_time;
	}

	public void setApproximate_time(String approximate_time) {
		this.approximate_time = approximate_time;
	}

	public String getSpecial_seat() {
		return special_seat;
	}

	public void setSpecial_seat(String special_seat) {
		this.special_seat = special_seat;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
