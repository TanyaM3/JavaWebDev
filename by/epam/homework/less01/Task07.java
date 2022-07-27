package by.epam.homework.less01;
import java.util.Scanner;

public class Task07 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Введите число а ");
		double a = scanner.nextDouble();
		System.out.print("Введите число b ");
		double b = scanner.nextDouble();
		System.out.print("Введите число h ");
		double h = scanner.nextDouble();
		double f = 0;
		
		System.out.println("Аргумент \tЗначение функции");
		while (a <= b) {
			f = Math.pow(Math.sin(a), 2) - Math.cos(2 * a);
			System.out.printf(" %.3f \t\t %.3f %n", a, f);
			a += h;
		}
	}
}
