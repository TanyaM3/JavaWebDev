package by.epam.homework.less01;
import java.util.Scanner;

public class Task08 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите размер массива");
		int n = scanner.nextInt();
		System.out.println("Введите число k");
		int k = scanner.nextInt();
		int sum = 0;

		int[] array = new int[n];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * n);
		}
		
		System.out.print("Массив: ");
		for (int i : array) {
			System.out.print(i + " ");
		}
		
		for (int num : array) {
			if (num % k == 0) {
				sum += num;
			}
		}
		System.out.println("\nСумма чисел, кратных " + k + " : " + sum);
	}
}
