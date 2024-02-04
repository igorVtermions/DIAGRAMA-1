package Diagrama1;

public class Circle implements Figure {

	public String collor;
	private double radius;
	
	
	public Circle() {
		
	}
	
	public Circle(String collor, double radius) {
		super();
		this.collor = collor;
		this.radius = radius;
	}
	
	public String getCollor() {
		return collor;
	}

	public void setCor(String collor) {
		this.collor = collor;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	

	public void diameter() {
		System.out.println("DIAMETRO: " + radius * 2);
	}


	public void area() {
		System.out.println("ÁREA: " + 3.14 * (Math.pow(getRadius(), 2)));
	}


	public String toString() {
		System.out.println("\n*CIRCULO*");
		return "[COR = " + collor + ", RAIO = " + radius + "]";
	}
    
}