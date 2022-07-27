package by.epam.homework.less02;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите число x: ");
		double x = sc.nextDouble();
		System.out.print("Введите число y: ");
		double y = sc.nextDouble();
		System.out.print("Результат: " + (((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x * y)));
	}
}