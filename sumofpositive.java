package javalab;
import java.util.Scanner;
public class sumofpositive {
public static void main(String [] args) {
	int num,sum=0;
	Scanner sc=new Scanner(System.in);
	do {
		System.out.println("enter a number");
		num=sc.nextInt();
		if(num>0)
			sum=sum+num;
	}while(num>0);
	System.out.println("sum is"+sum);
		
	}
}

