package by.epam.homework.less11.airplane;

import java.io.Serializable;
import java.sql.Time;
import java.util.Objects;

public class Airplane implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String destination;
	private int flightNumber;
	private String planeType;
	private Time departureTime;
	private String day;

	public Airplane() {

	}

	public Airplane(String destination, int flightNumber, String planeType, Time departureTime, String day) {
		super();
		this.destination = destination;
		this.flightNumber = flightNumber;
		this.planeType = planeType;
		this.departureTime = departureTime;
		this.day = day;
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
		return this.destination.equals(destination); 
	}

	public boolean isPlaneOnTheDay(String day) {
		return this.day.equals(day);
	}

	public boolean isPlaneOnTheDayAfterTime(String day, Time time) {
		return this.day.equals(day) && this.departureTime.after(time);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(day, departureTime, destination, flightNumber, planeType);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Airplane other = (Airplane) obj;
		return Objects.equals(day, other.day) && Objects.equals(departureTime, other.departureTime)
				&& Objects.equals(destination, other.destination) && flightNumber == other.flightNumber
				&& Objects.equals(planeType, other.planeType);
	}

	@Override
	public String toString() {
		return "Airplane [destination=" + destination + ", flightNumber=" + flightNumber + ", planeType=" + planeType
				+ ", departureTime=" + departureTime + ", day=" + day + "]";
	}
}
