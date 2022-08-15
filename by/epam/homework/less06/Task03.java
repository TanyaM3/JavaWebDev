package by.epam.homework.less06;
/*
 *№42: Строка состоит из слов, разделенных одним или
 *несколькими пробелами. Найдите слово наибольшей длины.
 */
public class Task03 {

	public static void main(String[] args) {
		String a = "Hello world!   javaaaa abc";
		int count = 0;
		int max = 0;
		String intermResult = "";
		String result = "";
		for (int i = 0; i < a.length(); i++) {
			if (a.charAt(i) != ' ') {
				count++;
				intermResult = intermResult + a.charAt(i);
			} else {
				if (count > max) {
					max = count;
					result = intermResult;
					intermResult = "";
					count = 0;
				}
			}
		}
		System.out.print(result);
	}
}