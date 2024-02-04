package Diagrama1;

public class Triangle implements Figure {
	
	private String collor;
	private double base;
	private double height;
	
	public Triangle() {
		
	}
	
	public Triangle(String collor, double base, double height) {
		super();
		this.collor = collor;
		this.base = base;
		this.height = height;
	}
	
	public String getcollor() {
		return collor;
	}

	public void setcollor(String collor) {
		this.collor = collor;
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
	
	public void diameter() {	
	}
	
	public void area() {
		System.out.println("ÁREA:  " + (this.base * this.height) / 2);
	}
	
	public String toString() {
		System.out.println("\n*TRIANGULO*");
		return "[COR = " + collor + ", BASE = " + base + ", ALTURA = " + height + "]";
	}
}