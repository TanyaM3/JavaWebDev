package by.epam.homework.less04;
/*
 * В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких чисел 
 * несколько, то определить наименьшее из них.
 */

public class Task19 {
	public static void main(String[] args) {
		int[] arr = new int[] { 5, 7, 12, 2, 2, 7, 9, 2, 5, 5 };
		int[] freqArr = new int[arr.length];

		int a = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					freqArr[a]++;
				}
			}
			a++;
		}

		int freq = freqArr[0];
		int num = arr[0];

		for (int i = 0; i < freqArr.length; i++) {
			if (freqArr[i] > freq) {
				freq = freqArr[i];
				num = arr[i];
			}
			if (freq == freqArr[i] && arr[i] < num) {
				num = arr[i];
			}
		}
		System.out.print("Наиболее часто встречающееся наименьшее число: " + num);
	}
}