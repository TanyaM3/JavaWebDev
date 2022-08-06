package by.epam.homework.less04;
/*
 * Дана последовательность целых чисел. Образовать новую последовательность, 
 * выбросив из исходной те члены, которые равны min(a1, a2...an) 
 */
public class Task17 {

	public static void main(String[] args) {
		int[] a = new int[] { 6, 2, 9, 5, 1, 15, 19, 33, 1 };
		int min = a[0];
		int count = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == min) {
				count++;
			}
		}
		
		int[] b = new int[a.length - count];
		for (int i = 0, j = 0; i < a.length; i++) {
			if (a[i] != min) {
				b[j] = a[i];
				j++;
			}
		}
		
		System.out.print("Исходный массив:   ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		System.out.print("\nПолученный массив: ");
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i] + " ");
		}
	}
}