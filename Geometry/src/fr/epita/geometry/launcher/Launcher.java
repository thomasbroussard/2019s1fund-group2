package fr.epita.geometry.launcher;

import java.util.Arrays;
import java.util.List;

import fr.epita.geometry.datamodel.Circle;
import fr.epita.geometry.datamodel.Shape;
import fr.epita.geometry.datamodel.Square;
import fr.epita.geometry.datamodel.Triangle;

public class Launcher {

	public static void main(String[] args) {
		
		Circle circle1 = new Circle(10);
	
		Circle circle2 = new Circle(20);
		Circle circle3 = new Circle(30);
		Square square1 = new Square(10);
		Square square2 = new Square(20);
		Square square3 = new Square(30);
		Triangle triangle1 = new Triangle(10, 20, 30, 40);
		Triangle triangle2 = new Triangle(20, 30, 40, 50);
		Triangle triangle3 = new Triangle(30, 40, 50, 60);
	
		List<Shape> shapes = Arrays.asList(circle1, circle2, circle3, square1, square2, square3, triangle1, triangle2, triangle3);
		
		double globalArea = 0.0;
		double globalPerimeter = 0.0;
		for (Shape shape : shapes) {
			globalArea += shape.calculateArea();
			globalPerimeter += shape.calculatePerimeter();
		}
		System.out.println("global area = " + globalArea);
		System.out.println("global perimeter = " + globalPerimeter);
		

	}

}
