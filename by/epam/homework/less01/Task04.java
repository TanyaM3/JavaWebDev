package by.epam.homework.less01;
import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите координаты точки");
		System.out.print("x ");
		int x = scanner.nextInt();
		System.out.print("y ");
		int y = scanner.nextInt();

		if (((y <= 4 && y >= -3) && (x >= -2 && x <= 2)) || (y >= -3 && y <= 0) && (x >= -4 && x <= 4)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
