package by.epam.homework.less04;
/*
 * Определить количество элементов последовательности натуральных чисел, кратных
 * числу М и заключенных в промежутке от L до N.
 */
public class Task13 {
	public static void main(String[] args) {
		int[] a = new int[] { 6, 2, 9, 5, 1, 15, 3, 19, 33 };
		int m = 3;
		int l = 5;
		int n = 25;
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % m == 0) {
				if (a[i] > l && a[i] < n) {
					count++;
				}
			}
		}
		System.out.print("Количество элементов: " + count);
	}
}