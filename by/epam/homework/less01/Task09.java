package by.epam.homework.less01;
import java.util.Scanner;

public class Task09 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Введите размер первого массива ");
		int x = scanner.nextInt();
		System.out.print("Введите размер второго массива ");
		int y = scanner.nextInt();
		System.out.print("Введите число k <= " + x + " ");
		int k = scanner.nextInt();
		int count = 0;
		
		int[] array1 = new int[x];
		int[] array2 = new int[y];

		for (int i = 0; i < array1.length; i++) {
			array1[i] = (int) (Math.random() * x);
		}
		
		System.out.print("Массив 1: ");
		for (int i : array1) {
			System.out.print(i + " ");
		}
		
		System.out.println("");
		
		for (int i = 0; i < array2.length; i++) {
			array2[i] = (int) (Math.random() * y);
		}
		
		System.out.print("Массив 2: ");
		for (int i : array2) {
			System.out.print(i + " ");
		}
		
		System.out.println("");
		int[] array3 = new int[x + y];
		
		for (int i = 0; i < array3.length; i++) {
			if (i <= k) {
				array3[i] = array1[i];
			} else if ((i > k) && count < y) {
				array3[i] = array2[count];
				count++;
			} else {
				array3[i] = array1[i - k - 1];
			}
		}
		
		System.out.print("Итоговый массив: ");
		for (int num : array3) {
			System.out.print(num + " ");
		}
	}
}
