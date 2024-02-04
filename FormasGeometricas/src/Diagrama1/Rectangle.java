package Diagrama1;

public class Rectangle implements Figure{
	
	private  String collor;
	private  double base;
	private  double height;
	
	public Rectangle() {
		
	}
	
	public Rectangle(String collor, double base, double height) {
		super();
		this.collor = collor;
		this.base = base;
		this.height = height;
	}
	
	public String getCollor() {
		return collor;
	}

	public void setCollor(String collor) {
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
	
	public double area(double base, double height) {
		return base * height;
	}
	
	public void diameter() {	
	}
	
	public void area() {
		System.out.println("ÁREA: " + getBase() * getHeight());
	}

    public String toString() {
    	System.out.println("\n*RETANGULO*");
        return "[COR = " + collor + ", BASE = " + base + ", ALTURA = " + height + "]";
    }
	
}