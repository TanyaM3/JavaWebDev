package by.epam.homework.less05;
import java.util.Random;
/*
 * №32. Отсортировать строки матрицы по убыванию значений элементов.
 */
public class Task04 {

	public static void main(String[] args) {
		int[][] mas = new int[6][6];
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
			for (int j = 0; j < mas[i].length; j++) {
				if (j > 0) {
					if (mas[i][j] > mas[i][j - 1]) {
						int temp = mas[i][j - 1];
						mas[i][j - 1] = mas[i][j];
						mas[i][j] = temp;
					}
					int k = j;
					while (k > 0) {
						if (mas[i][k] > mas[i][k - 1]) {
							int temp = mas[i][k - 1];
							mas[i][k - 1] = mas[i][k];
							mas[i][k] = temp;
						}
						k--;
					}
				}
			}
		}
		
		System.out.println("Полученная матрица:");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}
	}
}
