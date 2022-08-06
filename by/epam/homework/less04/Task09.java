package by.epam.homework.less04;

/*
 * Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 */
public class Task09 {

	public static void main(String[] args) {
		double[] a = new double[] { 5, 9, 2, 12, 3, 26 };
		int maxInd = 0;
		int minInd = 0;
		double max = 0;
		double min = a[0];

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				maxInd = i;
			}
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
				minInd = i;
			}
		}

		System.out.print("Исходный массив: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}

		max = a[maxInd];
		min = a[minInd];
		a[maxInd] = min;
		a[minInd] = max;

		System.out.print("\nПолученный массив: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
	}
}