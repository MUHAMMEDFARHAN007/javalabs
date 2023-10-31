package javalab;

public class Abstact {
	public static void main(String [] args) {
		Rectangle rectangle =new Rectangle();
		Triangle triangle=new Triangle();
		Hexagon hexagon=new Hexagon();
		rectangle.numberofSides();
		triangle.numberofSides();
		hexagon.numberofSides();
		}
}
abstract class Shape{
	abstract public void numberofSides() ;
}
 class Rectangle extends Shape{
	public void numberofSides() {
		System.out.println("Number of sides in rectangle=4");
}
}
 class Triangle extends Shape{
	public void numberofSides() {
		System.out.println("Number of sides in triangle=3");
	}
}
 class Hexagon extends Shape{
	public void numberofSides() {
		System.out.println("Number of sides in hexagon=6");
	}	
 }
