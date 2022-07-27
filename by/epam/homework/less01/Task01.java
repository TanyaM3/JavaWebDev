package by.epam.homework.less01;
import java.util.Scanner;

public class Task01 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите четырехзначное число");
		int x = scanner.nextInt();
		int sum1 = 0;

		for (int i = 0; i < 2; i++) {
			sum1 += (x % 10);
			x /= 10;
		}
		System.out.println("Сумма двух последних цифр " + sum1);
		int sum2 = 0;

		for (int i = 0; i < 2; i++) {
			sum2 += (x % 10);
			x /= 10;
		}
		System.out.println("Сумма двух первых цифр " + sum2);
		System.out.print("\nСумма двух первых цифр заданного четырехзначного числа равна сумме двух его последних цифр: ");
		
		if (sum1 == sum2) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
