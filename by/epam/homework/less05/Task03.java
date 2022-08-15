package by.epam.homework.less05;

/*
 * №15
 */
public class Task03 {

	public static void main(String[] args) {
		int n = 6;
		int[][] mas = new int[n][n];
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == j) {
					mas[i][j] = n;
					n--;
				} else {
					mas[i][j] = 0;
				}
			}
		}
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("%4d", mas[i][j]);
			}
			System.out.println();
		}
	}
}