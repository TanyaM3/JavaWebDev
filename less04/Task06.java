package by.epam.homework.less04;
/*
 * Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину числовой оси, содержащую все эти числа.
 */
public class Task06 {

	public static void main(String[] args) {
		int[] a = new int[] { 5, 3, 9, 15, 35, 7, 19 };
		int min = a[0];
		int max = a[0];
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		System.out.print("Наименьшая длина числовой оси: " + (max - min));
	}
}