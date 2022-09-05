package by.epam.homework.less11;

public class Triangle {
	private double a;
	private double b;
	private double c;

	public Triangle(double a, double b, double c) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double perimeter() {
		return a + b + c;
	}

	public double semiperimeter() {
		return (a + b + c) / 2;
	}

	public double square() {
		return Math.sqrt((semiperimeter()) * (semiperimeter() - a) * (semiperimeter() - b) * (semiperimeter() - c));
	}
}