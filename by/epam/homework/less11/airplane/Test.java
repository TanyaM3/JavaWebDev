package by.epam.homework.less11.airplane;

import java.sql.Time;

public class Test {

	public static void main(String[] args) {
		Airport msq = new Airport();
		Airplane plane1 = new Airplane("Berlin", 123, "Airbus", new Time(55474830), "Mondauy");
		Airplane plane2 = new Airplane("Moscow", 234, "Boeing", new Time(21243456), "Tuesday");
		Airplane plane3 = new Airplane("Berlin", 456, "Airbus", new Time(6524330), "Friday");
		Airplane plane4 = new Airplane("Vilnius", 678, "Airbus", new Time(9123456), "Tuesday");

		msq.addPlane(plane1);
		msq.addPlane(plane2);
		msq.addPlane(plane3);
		msq.addPlane(plane4);
		
		for(Airplane plane : msq.airplanes) {
			if(plane.isPlaneInTheDirection("Berlin")) {
				System.out.println("Plane № " + plane.getFlightNumber() + " to " + plane.getDestination() + " on " + plane.getDay() + ", departure time " + plane.getDepartureTime());
			}
		}
		
		System.out.println();
		
		for(Airplane plane : msq.airplanes) {
			if(plane.isPlaneOnTheDay("Tuesday")) {
				System.out.println("Plane № " + plane.getFlightNumber() + " to " + plane.getDestination() + " on " + plane.getDay() + ", departure time " + plane.getDepartureTime());
			}
		}
		
		System.out.println();
		
		for(Airplane plane : msq.airplanes) {
			if(plane.isPlaneOnTheDayAfterTime("Tuesday", new Time(9123777))) {
				System.out.println("Plane № " + plane.getFlightNumber() + " to " + plane.getDestination() + " on " + plane.getDay() + ", departure time " + plane.getDepartureTime());
			}
		}
	}
}