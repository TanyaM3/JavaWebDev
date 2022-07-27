package by.epam.homework.less01;
import java.util.Scanner;

public class Task06 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите число а");
		int a = scanner.nextInt();
		System.out.println("Введите число b");
		int b = scanner.nextInt();
		System.out.println("Введите число c");
		int c = scanner.nextInt();
		int max = 0;
		int min = 0;
		
		if (a > b && a > c) {
			max = a;
		} else if (b > a && b > c) {
			max = b;
		} else {
			max = c;
		}

		if (a < b && a < c) {
			min = a;
		} else if (b < a && b < c) {
			min = b;
		} else {
			min = c;
		}
		System.out.print("Cумма большего и меньшего числа: " + (min + max));
	}
}
