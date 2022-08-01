package by.epam.homework.less03;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		//№25: модель анализа пожарного датчика в помещении
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите температуру: ");
		int t = sc.nextInt();
		if (t > 60) {
			System.out.print("Пожароопасная ситуация");
		} else {
			System.out.print("Норма");
		}
	}
}
