package Hieu6113367;

import java.text.DecimalFormat;

public class QECalculator {
	double a, b, c;
	protected QECalculator(double x, double y, double z) {
		this.a = x; this.b = y; this.c = z;
	}
	
	protected String Calculate() {
		DecimalFormat df = new DecimalFormat("#.##");
		if(a == 0)
			if(b == 0)
				if(c == 0) return "Phương trình vô số nghiệm";
				else return "Phương trình vô nghiệm";
			else {
				double x = -c / b;
				return String.valueOf(df.format(x));
			}
		else {
			double delta = b * b - 4 * a * c;
			if(delta < 0) return "Phương trình vô nghiệm";
			else if (delta == 0) {
				double x = -b / (2 * a);
				return "Phương trình có nghiệm kép x1, x2 = " + String.valueOf(df.format(x));
			}
			else {
                double x1 = (double)(-b - Math.sqrt(delta)) / (2 * a);
                double x2 = (double)(-b + Math.sqrt(delta)) / (2 * a);
                return "Phương trình có nghiệm x1 = " + String.valueOf(df.format(x1)) + ", x2 = " + String.valueOf(df.format(x2));
			}
		}
		
	}
}
