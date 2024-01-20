package Hieu61133637;

import java.util.Scanner;

public class Lab1Bai1 {
	
	public static Student Input() {
		Student student = new Student();
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập họ và tên: ");
		student.Name = scan.nextLine();
		System.out.print("Nhập điểm trung bình: ");
		student.AvgScore = scan.nextDouble();
		scan.close();
		return student;
	}
	
	public static void Output() {
		Student item = Input();
		System.out.println(item.Name + " " + item.AvgScore + " điểm");
	}
	
	public static void main(String[] args) {
		Output();
	}

}
