package by.epam.homework.less03;

import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		//№18: Подсчитать количество отрицательных среди чисел а, b, с.
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите число a: ");
		double a = sc.nextDouble();
		System.out.print("Введите число b: ");
		double b = sc.nextDouble();
		System.out.print("Введите число c: ");
		double c = sc.nextDouble();
		int count = 0;
		if (a < 0) {
			count++;
		}
		if (b < 0) {
			count++;
		}
		if (c < 0) {
			count++;
		}
		System.out.print("Количество отрицательных чисел: " + count);
	}
}