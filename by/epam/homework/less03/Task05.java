package by.epam.homework.less03;

import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		//№40: Вычислить значение функции
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите число x: ");
		double x = sc.nextDouble();
		double f = 0;
		if (x <= 3) {
			f = x * x - 3 * x + 9;
		} else {
			f = 1 / (Math.pow(x, 3) + 6);
		}
		System.out.printf("F(x) = %.3f" , f);
	}
}
