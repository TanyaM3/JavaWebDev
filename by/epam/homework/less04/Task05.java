package by.epam.homework.less04;
/*
 * Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из четных чисел этой последовательности.
 * Если таких чисел нет, то вывести сообщение об этом факте.
 */
public class Task05 {

	public static void main(String[] args) {
		int[] a = new int[] { 2, 5, 1, 6, 3, 7, 8, 15 };
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				count++;
			}
		}
		
		if (count == 0) {
			System.out.print("Нет четных чисел");
		}
		
		int[] b = new int[count];
		for (int i = 0, j = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				b[j] = a[i];
				j++;
			}
		}
		
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}