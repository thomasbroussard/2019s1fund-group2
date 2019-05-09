package fr.epita.geometry.datamodel;

public class Rectangle implements Shape {
	
	private double width;
	private double height;
	
	
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double calculateArea() {
		return this.width * this.height;
	}

	@Override
	public double calculatePerimeter() {
		return 2 * this.width + 2 * this.height; 
	}

}
