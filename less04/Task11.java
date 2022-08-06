package by.epam.homework.less04;
/*
 * Даны натуральные числа а1 ,а2 ,..., аn . Указать те из них, у которых остаток от деления на М равен L (0 < L < М-1).
 */
public class Task11 {

	public static void main(String[] args) {
		double[] a = new double[] { 7, 9, 3, 2, 11, 18, 4 };
		double m = 5;
		double l = 1;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % m == l) {
				System.out.print(a[i] + " ");
			}
		}
	}
}