package ntu.nmh61133637;

public class Calculator {
	private double numA, numB;
	public Calculator() {
		
	}
	public Calculator(double a, double b) {
		this.numA = a; this.numB = b;
	}
	public double getNumA() {
		return numA;
	}
	public void setNumA(double numA) {
		this.numA = numA;
	}
	public double getNumB() {
		return numB;
	}
	public void setNumB(double numB) {
		this.numB = numB;
	}
	
	protected double Plus() {
		return numA + numB;
	}
	protected double Minus() {
		return numA - numB;
	}
	protected double Multiply() {
		return numA * numB;
	}
	protected double Divide() {
		return numA / numB;
	}
}
