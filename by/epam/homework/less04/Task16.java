package by.epam.homework.less04;

public class Task16 {

	public static void main(String[] args) {
		double[] a = new double[] { 6, 2, 9, 5, 1, 35, 19, 33 };
		int n = a.length;
		double[] b = new double[n / 2];

		System.out.print("Исходный массив: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		for (int i = 0, j = 0; i < a.length / 2; i++) {
			b[j] = a[i] + a[n - 1 - i];
			j++;
		}

		System.out.print("\nПолученный массив: ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}

		double max = b[0];
		for (int i = 0; i < b.length; i++) {
			if (b[i] > max) {
				max = b[i];
			}
		}
		System.out.print("\nМаксимум: " + max);
	}
}