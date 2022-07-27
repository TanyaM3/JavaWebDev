package by.epam.homework.less01;
import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.print("Введите четное число n ");
		int n = 0;
		
		while (true) {
			n = scanner.nextInt();
			if (n % 2 != 0) {
				System.out.print("Введите четное число ");
			} else {
				break;
			}
		}
		int[][] matrix = new int[n][n];

		for (int i = 0; i < matrix.length; i++) {
			if ((i + 1) % 2 == 0) {
				for (int j = 0; j < matrix[i].length; j++) {
					matrix[i][j] = n - j;
				}
			} else {
				for (int j = 0; j < matrix[i].length; j++) {
					matrix[i][j] = j + 1;
				}
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(matrix[i][j]);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
