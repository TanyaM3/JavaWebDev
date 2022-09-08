package by.epam.homework.less11.airplane;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Airport implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private List<Airplane> airplanes = new ArrayList<Airplane>();;
	
	public Airport() {
		new ArrayList<Airplane>();
	}
	
	public Airport(List<Airplane> airplanes) {
		this.airplanes = airplanes;;
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
	
	public void deletePlane(Airplane plane) {
		airplanes.remove(plane);
	}
}
