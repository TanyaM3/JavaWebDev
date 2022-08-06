package by.epam.homework.less04;
/*
 * В целочисленной последовательности есть нулевые элементы. Создать массив из номеров этих элементов.
 */

public class Task02 {

	public static void main(String[] args) {
		int[] a = new int[] { 5, 7, 0, 11, 0, 45, 7, 3, 0 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				count++;
			}
		}

		int[] b = new int[count];
		for (int i = 0, j = 0; i < a.length; i++) {
			if (a[i] == 0) {
				b[j] = i;
				j++;
			}
		}

		System.out.print("Исходный массив: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.print("\nМассив с индексами нулей: ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}
