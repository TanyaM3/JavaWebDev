package by.epam.homework.less03;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		// №7: Вычислить значения функции на отрезке [а,b] c шагом h
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите a: ");
		int a = sc.nextInt();
		System.out.print("Введите b: ");
		int b = sc.nextInt();
		System.out.print("Введите h: ");
		int h = sc.nextInt();
		int y = 0;
		System.out.print("Результат: ");
		while (a <= b) {
			if (a > 2) {
				y = a;
			} else {
				y = -a;
			}
			System.out.print(" " + y);
			a += h;
		}
	}
}