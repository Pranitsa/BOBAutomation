package programe_;

import java.util.Scanner;

public class Prime {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int pr = sc.nextInt();
	
	int temp=0;
	for(int i=2;i<pr;i++)  //  if 7 // it will strt from 2 3 4 5 6 
	{
		if(pr%i==0) 
		{
			temp=temp+1;
		}
	}
	if(temp==0)
	{
		System.out.println("Numnber is prime");
	}
	else 
	{
		System.out.println("Numnber is not prime");
	}
}
}
