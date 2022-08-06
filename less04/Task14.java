package by.epam.homework.less04;

public class Task14 {

	public static void main(String[] args) {
		int[] a = new int[] { 6, 2, 9, 5, 1, 15, 19, 33 };
		int max = 0;
		int min = a[1];
		
		for (int i = 2; i < a.length; i += 2) {
			if (a[i] > max) {
				max = a[i];
			}
		}
		
		for (int i = 1; i < a.length; i += 2) {
			if (a[i] < min) {
				min = a[i];
			}
		}
		System.out.print("Max + min = " + (max + min));
	}
}