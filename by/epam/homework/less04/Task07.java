package by.epam.homework.less04;
/*
 * Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим числом.
 * Подсчитать количество замен.
 */
public class Task07 {

	public static void main(String[] args) {
		double[] a = new double[] { 5, 3, 9, 15, 35, 7, 19 };
		int z = 4;
		int count = 0;
		
		System.out.print("Исходный массив:   ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] > z) {
				a[i] = z;
				count++;
			}
		}
		
		System.out.print("\nПолученный массив: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + "  ");
		}
		
		System.out.print("\nКоличество замен: " + count);
	}
}