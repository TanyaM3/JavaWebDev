package by.epam.homework.less04;
/*
 * Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
 * положительных и нулевых элементов.
 */
public class Task08 {

	public static void main(String[] args) {
		double[] a = new double[] { 6, 8, -5, 9, 2, -6, 0, 3 };
		int pos = 0;
		int neg = 0;
		int zer = 0;
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				zer++;
			} else if (a[i] > 0) {
				pos++;
			} else if (a[i] < 0) {
				neg++;
			}
		}
		
		System.out.print("Количество негативных элементов: " + neg + "\nКоличество позитивных элементов: " + pos
				+ "\nКоличество нулевых элементов: " + zer);
	}
}