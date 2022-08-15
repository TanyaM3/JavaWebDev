package by.epam.homework.less06;

public class Task01 {

	public static void main(String[] args) {
		String str = "a b c 5 5 c b a";
		System.out.print(checkIfPolyndrom(str));
	}

	public static boolean checkIfPolyndrom(String str) {
		String strWithoutSpace = str.replace(" ", "");
		for (int i = 0; i < strWithoutSpace.length() / 2; i++) {
			if (strWithoutSpace.charAt(i) != strWithoutSpace.charAt(strWithoutSpace.length() - i - 1)) {
				return false;
			}
		}
		return true;
	}
}