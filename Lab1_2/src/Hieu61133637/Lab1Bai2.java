package Hieu61133637;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lab1Bai2 {
	
	public static void Input(Rectangle rec) {
		Scanner scan = new Scanner(System.in);
		try {
			while (rec.Width <= 0 || rec.Length <= 0) {
				
				System.out.print("Nhập chiều dài: ");
				rec.Length = scan.nextDouble();
				System.out.print("Nhập chiều rộng: ");
				rec.Width = scan.nextDouble();
			}
		} catch (InputMismatchException e) {
			System.out.println("Vui lòng nhập một số hợp lệ.");
		} finally {
			scan.close();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rec = new Rectangle();
		Input(rec);
		if (rec.Width <= 0 || rec.Length <= 0) return;
		System.out.println("Chu vi: " + rec.Perimeter(rec.Length, rec.Width));
		System.out.printf("Diện tích: %.2f\nCạnh nhỏ nhất: %.2f", rec.Area(rec.Length, rec.Width), rec.min(rec.Length, rec.Width));
	}

}
