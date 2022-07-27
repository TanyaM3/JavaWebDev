package by.epam.homework.less02;

import java.util.Scanner;

public class Task22 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите время t: ");
		int t = sc.nextInt();
		int hour = t / 3600;
		int min = (t - hour * 3600) / 60;
		int sec = t - hour * 3600 - min * 60;
		System.out.print("Время в формате ННч ММмин SSc: " + hour + "ч " + min + "мин " + sec + "с");
	}
}