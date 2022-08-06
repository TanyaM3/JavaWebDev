package by.epam.homework.less04;

public class IncertionSort {

	public static void main(String[] args) {
		int[] a = new int[] { 5, 9, 1, 23, 6, 2, 55, 81, 3 };
		System.out.print("Исходный массив: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		for (int i = 1; i < a.length; i++) {
			int current = a[i];
			int j = i;
			while (j > 0 && a[j - 1] > current) {
				a[j] = a[j - 1];
				j--;
			}
			a[j] = current;
		}
		
		System.out.print("\nОтсортированный массив: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}