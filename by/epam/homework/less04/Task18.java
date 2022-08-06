package by.epam.homework.less04;

import java.util.Scanner;

/*
 * «Суперзамок». Секретный замок для сейфа состоит из 10 расположенных в рад ячеек, в которые надо вставить 
 * игральные кубики. Но дверь открывается только в том случае, когда в любых трех соседних ячейках сумма точек на 
 * передних гранях кубиков равна 10. (Игральный кубик имеет на каждой грани от 1 до 6 точек). Напишите программу, 
 * которая разгадывает код замка при условии, что два кубика уже вставлены в ячейки.
*/
public class Task18 {
	public static void main(String[] args) {
		int[] a = new int[10];
		int x = 0;
		int y = 0;
		
		while (true) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Введите значение первого и второго кубика: ");
			x = sc.nextInt();
			y = sc.nextInt();
			if (x >=1 && x<=6 && y >= 1 && y <=6 && x + y >= 4 && x + y <= 9) {
				break;
			}
		}
		
		a[0] = x;
		a[1] = y;
		for (int i = 2; i < a.length; i++) {
			a[i] = 10 - a[i - 2] - a[i - 1];
		}
		
		System.out.print("Полученные значения кубиков: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}