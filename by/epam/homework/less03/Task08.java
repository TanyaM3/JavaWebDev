package by.epam.homework.less03;

import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		//№14: Дано натуральное n. вычислить: 1 + 1/2 + 1/3 + 1/4 + ... + 1/n.
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите число n: ");
		int n = sc.nextInt();
		double i = 1;
		double sum = 0;
		while(i <= n) {
			sum += 1 / i;
			i++;
		}
		System.out.printf("Результат: %.4f", sum);
	}
}