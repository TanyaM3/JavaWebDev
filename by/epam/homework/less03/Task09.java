package by.epam.homework.less03;

import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		/*
		 * №28: Написать программу, в которой вводятся два операнда Х и Y и знак
		 * операции (+, –, /, *). Вычислить результат Z в зависимости от знака.
		 * Предусмотреть реакции на возможный неверный знак операции, а также на ввод
		 * Y=0 при делении. Организовать возможность многократных вычислений без
		 * перезагрузки программа (т.е. построить цикл). В качестве символа прекращения
		 * вычислений принять‘0’.
		 */
		while (true) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.print("Введите знак операции: ");
			String op = sc.nextLine();
			if (op.equals("0")) {
				System.out.print("End");
				break;
			}
			System.out.print("Введите x: ");
			double x = sc.nextDouble();
			System.out.print("Введите y: ");
			double y = sc.nextDouble();

			if (op.contains("+")) {
				System.out.println("Результат: " + (x + y));
			} else if (op.equals("-")) {
				System.out.println("Результат: " + (x - y));
			} else if (op.equals("*")) {
				System.out.println("Результат: " + (x * y));
			} else if (op.equals("/")) {
				if (y != 0) {
					System.out.println("Результат: " + (x / y));
				} else {
					System.out.println("Деление на ноль запрещено");
				}
			} else {
				System.out.println("Неверный знак операции");
			}
		}
	}
}