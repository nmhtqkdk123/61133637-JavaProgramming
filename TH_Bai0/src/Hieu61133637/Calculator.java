package Hieu61133637;

public class Calculator {
	double a, b;
	protected Calculator(double a, double b) {
		this.a = a; this.b = b;
	}
	protected double Plus() {
		return a + b;
	}
	protected double Minus() {
		return a - b;
	}
	protected double Multiply() {
		return a * b;
	}
	protected double Divide() {
		return a / b;
	}
}
