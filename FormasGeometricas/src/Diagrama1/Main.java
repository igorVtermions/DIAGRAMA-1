package Diagrama1;

public class Main {

	public static void main(String[] args) {
		
		Figure rectangle = new Rectangle("ROXO", 50, 200);
		
		Figure triangle = new Triangle("AMARELO", 30, 10); 
		
		Figure Circle = new Circle("VERMELHO", 10);
		
		
		System.out.println(rectangle.toString());
		rectangle.area();
		
		
		System.out.println(triangle.toString());
		triangle.area();
		
	
		System.out.println(Circle.toString());
		Circle.diameter();
		Circle.area();
	}

}