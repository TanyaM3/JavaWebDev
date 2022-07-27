package by.epam.homework.less01;
import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите катетер а");
		double a = scanner.nextDouble();
		System.out.println("Введите катетер b");
		double b = scanner.nextDouble();

		double c = Math.sqrt((Math.pow(a, 2) + (Math.pow(b, 2))));

		double per = a + b + c;
		double s = 0.5 * a * b;
		
		System.out.printf("Периметр треугольника: %.3f %n ", per);
		System.out.printf("Площадь треугольника: %.3f %n", s);
	}
}
