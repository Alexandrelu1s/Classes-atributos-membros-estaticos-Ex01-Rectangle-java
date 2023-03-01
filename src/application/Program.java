package application;

import java.util.Scanner;

import entities.Rectangle;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter rectangle width: ");
		Double width = sc.nextDouble();
		
		System.out.print("Enter rectangle height: ");
		Double height = sc.nextDouble();
		
		Rectangle r = new Rectangle(width, height);
		r.area();
		r.perimeter();
		r.diagonal();
		
		System.out.println("Area = " + String.format("%.2f", r.area()) + "\nPerimeter = " + String.format("%.2f", r.perimeter()) 
		+ "\nDiagonal = " + String.format("%.2f", r.diagonal()));
		
		
		sc.close();
	}

}
