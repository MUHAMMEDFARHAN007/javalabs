/*
 * file          :sum of numbers
 * Description   :finding sum of two numbers
 * Author        :farhan
 * version       :1.0
 * Date          :26/09/2023
 */

package javalab;
import java.util.Scanner;
public class SumofNumbers {
public static void main(String [] args)
{
	int num1,num2,sum;
	Scanner sc = new Scanner (System.in);
	System.out.println("enter two numbers :");
	num1=sc.nextInt();
	num2=sc.nextInt();
	sum=num1+num2;
	System.out.println("sum of numbers is "+sum);
}	
}
