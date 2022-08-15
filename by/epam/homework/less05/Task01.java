package by.epam.homework.less05;
import java.util.Random;
/*
 * №28: Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. 
 * Определить, какой столбец содержит максимальную сумму.
 */

public class Task01 {

	public static void main(String[] args) {
		int n = 8;
		int max = 0;
		int maxInd = 0;
		int[][] mas = new int[n][n];
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10);
			}
		}
		
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < mas.length; i++) {
			int sum = 0;
			for (int j = 0; j < mas[i].length; j++) {
				sum += mas[j][i];
				if (sum > max) {
					maxInd = i;
				}
			}
			max = Math.max(max, sum);
			System.out.print("\nСумма столбца " + i + ": " + sum);
		}
		System.out.print("\nМаксимальную сумму содержит столбец " + maxInd + ", сумма равна " + max);
	}
}