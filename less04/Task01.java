package by.epam.homework.less04;
/*
 * В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.
 */
public class Task01 {

	public static void main(String[] args) {
		int[] a = new int[] { 8, 1, 2, 5, 9, 4 };
		int k = 2;
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % k == 0) {
				sum += a[i];
			}
		}
		System.out.print("Сумма элементов, кратных " + k + ": " + sum);
	}
}