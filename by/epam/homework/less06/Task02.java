package by.epam.homework.less06;
/*
 * Реализуйте метод, осуществляющий сжатие строки на
 * основе счетчика повторяющихся символов.
 */
public class Task02 {

	public static void main(String[] args) {
		String str = "aaabbcccc";
		System.out.print(compression(str));
	}

	public static String compression(String str) {
		String result = "";
		int count = 1;
		char letter = str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == letter) {
				count++;
			} else {
				result = result + letter + count;
				letter = str.charAt(i);
				count = 1;
			}
		}
		return result + letter + count;
	}
}