package fr.epita.geometry.datamodel;

public class Circle {
	
	private double radius;

	
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double calculateArea() {
		return this.radius * this.radius * Math.PI;
	}
	
	public double calculatePerimeter() {
		return this.radius * 2 * Math.PI;
	}
	
	
	
	

}
