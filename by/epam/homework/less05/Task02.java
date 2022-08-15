package by.epam.homework.less05;
import java.util.Random;
/*
 * №31: Сформировать матрицу из чисел от 0 до 999, вывести ее на экран. 
 * Посчитать количество двузначных чисел в ней.
 */
public class Task02 {

	public static void main(String[] args) {
		int n = 8;
		int count = 0;
		int[][] mas = new int[n][n];
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(999);
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
				if (mas[i][j] > 9 && mas[i][j] < 100) {
					count++;
				}
			}
		}
		System.out.print("\nКоличество двузначных элементов: " + count);
	}
}