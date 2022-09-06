package by.epam.homework.less11;

import java.util.Scanner;

public class CustomerTest {

	public static void main(String[] args) {
		Customer[] customers = new Customer[5];
		customers[0] = new Customer("123", "Black", "Jack", "Vasilevich", "pr.Pobeditelei 25", 678, "1111");
		customers[1] = new Customer("234", "Brown", "Max", "Ivanovich", "ul.Kupaly 3", 835, "2222");
		customers[2] = new Customer("345", "White", "Jan", "Janovich", "ul.Bogdanovicha 1", 467, "3333");
		customers[3] = new Customer("456", "Keen", "Jen", "Andreevna", "ul.Gaya 32", 975, "4444");
		customers[4] = new Customer("567", "Avseev", "Sam", "Maksimovich", "pr.Mira 63", 452, "5555");

		Customer.sortByName(customers);
		for (int i = 0; i < customers.length; i++) {
			customers[i].print();
		}

		System.out.println();

		System.out.println("Please enter card interval: ");
		Scanner sc = new Scanner(System.in);
		int from = sc.nextInt();
		int to = sc.nextInt();
		Customer.customersInCardInterval(customers, from, to);
	}
}