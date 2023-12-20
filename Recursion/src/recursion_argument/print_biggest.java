package recursion_argument;

import java.util.Scanner;

public class print_biggest {
	static int big=0;

	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the first no:");
		int a=sc.nextInt();
		System.out.println("enter the second no:");
		int b=sc.nextInt();
		System.out.println("enter the third no:");
		int c=sc.nextInt();
		System.out.println("enter the fourth no:");
		int d=sc.nextInt();
		System.out.println("enter the fifth  no:");
		int e=sc.nextInt();
		int x=big(big(big(a,b),c),big(d,e));
	    System.out.println("the biggest is:"+x);
	   
	}
	public static int big(int a,int b)
	{
		return a>b?a:b;
	}
}