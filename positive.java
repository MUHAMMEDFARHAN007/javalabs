package javalab;
import java.util.Scanner;
public class positive {
public static void main(String [] args)
{
Scanner sc = new Scanner(System.in);
int num,sum=0;
System.out.println("enter a number");
num=sc.nextInt();
while(num>10) {
	sum=sum+num;
	System.out.println("enter next number");
	num=sc.nextInt();
	
}
System.out.println("sum is"+sum);
}
	}
