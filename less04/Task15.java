package by.epam.homework.less04;
/*
 * Дана последовательность действительных чисел действитльных чисел. Указать те ее элементы, которые принадлежат отрезку [с, d].
 */
public class Task15 {

	public static void main(String[] args) {
		double[] a = new double[] { 6, 2, 9, 5, 1, 15, 19, 33 };
		double c = 3;
		double d = 15;
		System.out.print("Элементы, принадлежащие отрезку [" + c + ", " + d + "] : ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] > c && a[i] < d) {
				System.out.print(a[i] + "  ");
			}
		}
	}
}