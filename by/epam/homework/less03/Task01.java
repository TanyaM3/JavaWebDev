package by.epam.homework.less03;

import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		//№5: Составить программу определения наименьшего из двух чисел а и b.
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите число а: ");
		int a = sc.nextInt();
		System.out.print("Введите число b: ");
		int b = sc.nextInt();
		if (a > b) {
			System.out.println("Наименьшее число: " + b);
		} else if (a < b) {
			System.out.println("Наименьшее число: " + a);
		} else {
			System.out.println("а = b");
		}
	}
}
