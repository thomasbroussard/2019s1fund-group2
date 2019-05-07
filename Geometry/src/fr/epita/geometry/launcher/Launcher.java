package fr.epita.geometry.launcher;

import fr.epita.geometry.datamodel.Circle;

public class Launcher {

	public static void main(String[] args) {
		Circle circle1 = new Circle(10);
		System.out.println("area of circle1: " + circle1.calculateArea());
		System.out.println("perimeter of circle1: " +circle1.calculatePerimeter());
		

	}

}
