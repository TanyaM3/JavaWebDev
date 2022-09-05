package by.epam.homework.less11;

public class CounterTest {

	public static void main(String[] args) {
		Counter cr1 = new Counter();
		cr1.decr();
		System.out.println(cr1.currentValue());
		cr1.incr();
		System.out.println(cr1.currentValue());

		Counter cr2 = new Counter(1, 24, 2);
		System.out.println(cr2.currentValue());
		System.out.println(cr2.getMin());
	}
}