package javalab;
import java.util.Scanner;
public class methodoverload {
		public static void main(String[] args) {
			Area area = new Area();
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the Base of the Triangle: ");
			float trianglebase = scan.nextFloat();
			System.out.println("Enter the Height of the Triangle: ");
			float triangleheight = scan.nextFloat();
			System.out.println("Enter the width of the Rectangle: ");
			int rectanglewidth = scan.nextInt();
			System.out.println("Enter the Height of the Rectangle: ");
			int rectangleheight = scan.nextInt();
			System.out.println("Enter the radius of the circle: ");
			float radius = scan.nextFloat();
			System.out.println("Area of Triangle with base: "+trianglebase+ " and height: "+triangleheight+" is: "+area.Shapearea(triangleheight, trianglebase));
			System.out.println("Area of Rectangle with width: "+rectanglewidth+" and length "+rectangleheight+" is: "+area.Shapearea(rectanglewidth,rectangleheight));
			System.out.println("Area of Circle with radius: "+radius+" is: "+area.Shapearea(radius));
			
			
		}

	}
	class Area{
		static float Shapearea(float triangleh, float triangleb) {
			float area = 0.5f*triangleh*triangleb;
			return area;
		}
		static int Shapearea(int length, int breadth ) {
			int area =  length*breadth;
			return area;
		}
		static float Shapearea(float radius) {
			float area = 3.14f*radius*radius;
			return area;
		}
	}