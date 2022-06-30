package programe_;

import java.util.Scanner;

public class Reverse_array {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the size of Array");
	int n =sc.nextInt();
	System.out.println("enter"+" "+n+" "+"no of array element:");
	int a[]=new int[n];
	for(int i=0;i<n;i++) 
	{
		
	a[i]=sc.nextInt();
	
	
     }
	
	System.out.println("the reverse of array ");
	
	for(int i=a.length-1;i>=0;i--)
	{
	
		System.out.println(a[i]);
		
	}
	}
}
