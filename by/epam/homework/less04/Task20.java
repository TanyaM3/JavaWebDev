package by.epam.homework.less04;

/*
 * Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй элемент
 * (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 */
public class Task20 {

	public static void main(String[] args) {
		int[] a = new int[] { 5, 9, 11, 3, 6, 23, 43, 8, 9 };
		
		System.out.print("Иcходный массив: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		
		for (int i = 1; i < a.length; i += 2) {
			a[i] = 0;
		}
		
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				for (int j = i + 1; j < a.length; j++) {
					a[j - 1] = a[j];
				}
				a[a.length - 1] = 0;
			}
		}
		
		System.out.print("\nПолученный массив: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}