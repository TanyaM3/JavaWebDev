package by.epam.homework.less02;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите число x: ");
		double x = sc.nextDouble();
		System.out.print("Введите число y: ");
		double y = sc.nextDouble();
		System.out.println("Сумма: " + (x + y));
		System.out.println("Разность: " + (x - y));
		System.out.println("Произведение: " + (x * y));
		System.out.println("Частное: " + (x / y));
	}
}