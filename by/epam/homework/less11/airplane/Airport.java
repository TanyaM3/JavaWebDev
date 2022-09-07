package by.epam.homework.less11.airplane;

import java.util.ArrayList;

public class Airport extends Airplane {

	ArrayList<Airplane> airplanes = new ArrayList<Airplane>();

	public void addPlane(Airplane plane) {
		airplanes.add(plane);
	}
}