package fr.epita.geometry.datamodel;

public class Square implements Shape{
	
	private Rectangle rectangle;
	
	private double side;

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public Square(double side) {
		this.rectangle = new Rectangle(side, side);
	}
	
	public double calculateArea() {
		return this.rectangle.calculateArea();
	}
	
	public double calculatePerimeter() {
		return this.rectangle.calculatePerimeter();
	}
	
	
	

}
