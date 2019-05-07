package fr.epita.geometry.datamodel;

public class Triangle implements Shape{
	
	private double sideB;
	private double sideA;
	private double base;
	private double height;
	
	
	public Triangle(double sideB, double sideA, double base, double height) {
		this.sideB = sideB;
		this.sideA = sideA;
		this.base = base;
		this.height = height;
	}
	
	
	public double getSideB() {
		return sideB;
	}
	public void setSideB(double sideB) {
		this.sideB = sideB;
	}
	public double getSideA() {
		return sideA;
	}
	public void setSideA(double sideA) {
		this.sideA = sideA;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	
	public double calculateArea() {
		return this.base * this.height / 2;
	}
	
	public double calculatePerimeter() {
		return this.base + this.sideA + this.sideB;
	}
	

}
