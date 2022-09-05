package by.epam.homework.less11;

public class TimeTest {

	public static void main(String[] args) {
		Time t = new Time(23, 45, 34);
		t.printTime();
		t.addHours(5);
		t.printTime();
		t.addMinutes(20);
		t.printTime();
		t.addSeconds(3600);
		t.printTime();
	}
}