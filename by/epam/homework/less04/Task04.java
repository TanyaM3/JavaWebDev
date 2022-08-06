package by.epam.homework.less04;
/*
 * Дана последовательность действительных чисел а1 а2 ,..., аn . Выяснить, будет ли она возрастающей.
 */

public class Task04 {

	public static void main(String[] args) {
		double[] a = new double[] { 1, 3, 5, 6 };
		int count = 0;
		for (int i = 1; i < a.length; i++) {
			if (a[i-1] < a[i]) {
				count++;
			}
		}
		if (count == a.length - 1) {
			System.out.print("Последовательность возрастающая");
		} else {
			System.out.print("Последовательность не возрастающая");
		}
	}
}