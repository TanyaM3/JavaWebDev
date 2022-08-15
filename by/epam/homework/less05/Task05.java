package by.epam.homework.less05;
import java.util.Random;
/*
 * №38. Найдите сумму двух матриц
 */
public class Task05 {

	public static void main(String[] args) {

		int[][] mas1 = new int[4][4];
		int[][] mas2 = new int[4][4];
		int[][] sum = new int[4][4];

		Random rand = new Random();
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {
				mas1[i][j] = rand.nextInt(10);
			}
		}
		
		System.out.println("Матрица 1: ");
		for (int i = 0; i < mas1.length; i++) {
			for (int j = 0; j < mas1[i].length; j++) {
				System.out.printf("%4d", mas1[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < mas2.length; i++) {
			for (int j = 0; j < mas2[i].length; j++) {
				mas2[i][j] = rand.nextInt(10);
			}
		}

		System.out.println("Матрица 2: ");
		for (int i = 0; i < mas2.length; i++) {
			for (int j = 0; j < mas2[i].length; j++) {
				System.out.printf("%4d", mas2[i][j]);
			}
			System.out.println();
		}

		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				sum[i][j] = mas1[i][j] + mas2[i][j];
			}
		}

		System.out.println("Результат сложения двух матриц: ");
		for (int i = 0; i < sum.length; i++) {
			for (int j = 0; j < sum[i].length; j++) {
				System.out.printf("%4d", sum[i][j]);
			}
			System.out.println();
		}
	}
}