package javalab;
import java.util.Scanner;
public class attendence {
public static void main(String [] args) {
	int attendence,marks;
	Scanner sc =new Scanner(System.in);
	System.out.println("enter attendence :");
	attendence=sc.nextInt();
    if(attendence>90&&attendence<=100) {
    	marks=10;
    	System.out.println("marks is" +marks);
    }
    else if(attendence>80&&attendence<90)
    {
    	marks=8;
    	System.out.println("marks is" +marks);
    }
    else if(attendence>70&&attendence>60)
    {
    	marks=7;
    	System.out.println("marks is" +marks);
    }
    else if(attendence>60&&attendence<70)
    {
    	marks=6;
    	System.out.println("marks is" +marks);
    }
    else if(attendence>50&&attendence<60)
    {
    	marks=5;
    	System.out.println("marks is" +marks);
    }
    else
       System.out.println("attendence not enough");
    
}
}


