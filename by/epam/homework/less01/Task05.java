package by.epam.homework.less01;
import java.util.Scanner;

public class Task05 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите число а");
		double a = scanner.nextDouble();
		System.out.println("Введите число b");
		double b = scanner.nextDouble();
		System.out.println("Введите число c");
		double c = scanner.nextDouble();
		
		if (a > 0) {
			System.out.println(a * a);
		} else {
			System.out.println(Math.pow(a, 4));
		}
		
		if (b > 0) {
			System.out.println(b * b);
		} else {
			System.out.println(Math.pow(b, 4));
		}
		
		if (c > 0) {
			System.out.println(c * c);
		} else {
			System.out.println(Math.pow(c, 4));
		}
	}
}
