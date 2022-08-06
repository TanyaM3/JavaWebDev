package by.epam.homework.less04;

/*
 * Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых являются
 * простыми числами. 
 */
public class Task12 {

	public static void main(String[] args) {
		int[] a = new int[] { 6, 2, 9, 5, 1, 15, 19, 33 };
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			if (isSimple(i)) {
				sum += a[i];
			}
		}

		System.out.print("Исходный массив: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		System.out.print("\nСумма чисел, порядковые номера которых являются простыми числами: " + sum);
	}

	public static boolean isSimple(int num) {
		if (num < 2) {
			return false;
		}
		double s = Math.sqrt(num);
		for (int i = 2; i <= s; i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
}