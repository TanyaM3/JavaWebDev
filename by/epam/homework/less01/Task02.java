package by.epam.homework.less01;
import java.util.Scanner;

public class Task02 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите число а");
		double a = scanner.nextDouble();
		System.out.println("Введите число b");
		double b = scanner.nextDouble();
		System.out.println("Введите число c");
		double c = scanner.nextDouble();

		double d = (((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / (2 * a)) - Math.pow(a, 3) * c + Math.pow(b, -2));
		System.out.printf("Результат: %.3f", d);
	}
}
