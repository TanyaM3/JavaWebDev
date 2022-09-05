package by.epam.homework.less11;

import java.util.Scanner;

public class TrainTest {

	public static void main(String[] args) {

		Train[] trains = new Train[5];
		trains[0] = new Train("Minsk", 111, "10:45");
		trains[1] = new Train("Grodno", 222, "15:30");
		trains[2] = new Train("Vitebsk", 333, "08:00");
		trains[3] = new Train("Brest", 123, "19:15");
		trains[4] = new Train("Brest", 234, "13:05");

		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter the train number: ");
		int num = sc.nextInt();
		trains[0].findTrain(num, trains).print();

		System.out.println();

		trains[0].sortByNumber(trains);
		for (int i = 0; i < trains.length; i++) {
			trains[i].print();
		}

		System.out.println();

		trains[0].sortByDestination(trains);
		for (int i = 0; i < trains.length; i++) {
			trains[i].print();
		}
	}
}