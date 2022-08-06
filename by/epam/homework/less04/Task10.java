package by.epam.homework.less04;
/*
 * Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 */
public class Task10 {

	public static void main(String[] args) {
		int[] a = new int[] { -6, 5, 9, 3, -2, 7, 11 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] > i) {
				System.out.print(a[i] + " ");
			}
		}
	}
}