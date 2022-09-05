package by.epam.homework.less11;

public class Counter {
	private int current;
	private int max;
	private int min;

	public Counter(int current, int max, int min) {
		super();
		this.current = current;
		this.max = max;
		this.min = min;
		if (current < min) {
			System.out.println("The current value is smaller than the minimum --> minimum = current value");
			this.min = current;
		}
		if (current > max) {
			System.out.println("The current value is greater than the maximum --> maximum = current value");
			this.max = current;
		}
	}

	public Counter() {
		current = 5;
		max = 20;
		min = 1;
	}

	public int getCurrent() {
		return current;
	}

	public void setCurrent(int current) {
		this.current = current;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public void incr() {
		current++;
	}

	public void decr() {
		current--;
	}

	public int currentValue() {
		return current;
	}
}