package by.epam.homework.less11.airplane;

import java.sql.Time;
import java.util.ArrayList;
import java.util.List;

public class Airport extends Airplane {

	private List<Airplane> airplanes = new ArrayList<Airplane>();
	
	public Airport(String destination, int flightNumber, String planeType, Time departureTime, String day,
			List<Airplane> airplanes) {
		super(destination, flightNumber, planeType, departureTime, day);
		this.airplanes = airplanes;
	}
	
	public Airport() {
		
	}

	public List<Airplane> getAirplanes() {
		return airplanes;
	}

	public void setAirplanes(List<Airplane> airplanes) {
		this.airplanes = airplanes;
	}

	public void addPlane(Airplane plane) {
		airplanes.add(plane);
	}
}
