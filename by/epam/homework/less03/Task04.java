package by.epam.homework.less03;

import java.util.Scanner;

public class Task04 {

	public static void main(String[] args) {
		//№34: Составить программу, реализующую эпизод применения компьютера в книжном магазине.
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Введите стоимость книг: ");
		double booksCost = sc.nextDouble();
		System.out.print("Введите сумму денег, внесенную покупателем: ");
		double cash = sc.nextDouble();
		if (cash == booksCost) {
			System.out.print("Спасибо!");
		} else if (cash > booksCost) {
			System.out.print("Возьмите сдачу " + (cash - booksCost));
		} else if (cash < booksCost) {
			System.out.print("Недостающая сумма: " + (booksCost - cash));
		}
	}
}
