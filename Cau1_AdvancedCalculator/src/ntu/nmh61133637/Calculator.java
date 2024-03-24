package ntu.nmh61133637;

import java.math.BigInteger;

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
	protected double Exponent() {
		return Math.pow(numA, numB);
	}
	protected double Exponent(String txta, double b) {
		double a = Double.parseDouble(txta);
		return Math.pow(a, b);
	}
	protected double Exponent(double a, String txtb) {
		double b = Double.parseDouble(txtb);
		return Math.pow(a, b);
	}
	public long Factorial(int number) {
        if(number == 0) return 1;
        return number * Factorial(number - 1);
    }
	public double SquareRoot(double number) {
		return Math.sqrt(number);
	}
	public double CubeRoot(double number) {
		return Math.cbrt(number);
	}
	public double YRootX() {
		return Math.pow(numA, 1/numB);
	}
	public double Sin(String number) {
		return Math.sin(Double.parseDouble(number) * Math.PI / 180);
	}
	public double Cos(String number) {
		return Math.cos(Double.parseDouble(number) * Math.PI / 180);
	}
	public double Tan(String number) {
		return Math.tan(Double.parseDouble(number) * Math.PI / 180);
	}
	public double Logarithm() {
		return Math.log(numA)/Math.log(numB);
	}
	public double NaturalLogarithm(String number) {
		return Math.log(Double.parseDouble(number));
	}
	
	public static BigInteger factorial(BigInteger number) {
	    BigInteger result = BigInteger.valueOf(1);

	    for (long factor = 2; factor <= number.longValue(); factor++) {
	        result = result.multiply(BigInteger.valueOf(factor));
	    }

	    return result;
	}
}
