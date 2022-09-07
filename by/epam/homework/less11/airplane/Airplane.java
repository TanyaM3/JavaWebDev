package by.epam.homework.less11.airplane;

import java.sql.Time;

public class Airplane {
	private String destination;
	private int flightNumber;
	private String planeType;
	private Time departureTime;
	private String day;

	public Airplane(String destination, int flightNumber, String planeType, Time departureTime, String day) {
		super();
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.planeType = planeType;
		this.departureTime = departureTime;
		this.day = day;
	}

	public Airplane() {

	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public int getFlightNumber() {
		return flightNumber;
	}

	public void setFlightNumber(int flightNumber) {
		this.flightNumber = flightNumber;
	}

	public String getPlaneType() {
		return planeType;
	}

	public void setPlaneType(String planeType) {
		this.planeType = planeType;
	}

	public Time getDepartureTime() {
		return departureTime;
	}

	public void setDepartureTime(Time departureTime) {
		this.departureTime = departureTime;
	}

	public String getDay() {
		return day;
	}

	public void setDay(String day) {
		this.day = day;
	}

	public boolean isPlaneInTheDirection(String destination) {
		if (this.destination.equals(destination)) {
			return true;
		}
		return false;
	}

	public boolean isPlaneOnTheDay(String day) {
		if (this.day.equals(day)) {
			return true;
		}
		return false;
	}

	public boolean isPlaneOnTheDayAfterTime(String day, Time time) {
		if (this.day.equals(day) && this.departureTime.after(time)) {
			return true;
		}
		return false;
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

	@Override
	public String toString() {
		return "Airplane [destination=" + destination + ", flightNumber=" + flightNumber + ", planeType=" + planeType
				+ ", departureTime=" + departureTime + ", day=" + day + "]";
	}

}
