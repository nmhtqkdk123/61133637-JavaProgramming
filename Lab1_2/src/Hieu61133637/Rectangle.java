package Hieu61133637;



public class Rectangle {
	public double Length;
	public double Width;
	
	public double Perimeter(double length, double width) {
		return (length + width) * 2;
	}
	
	public double Area(double length, double width) {
		return length * width;
	}
	
	public double min(double x, double y) {
		if(x < y) return x;
		return y;
	}
}
