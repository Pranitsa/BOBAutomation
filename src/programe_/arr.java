package programe_;

import java.util.Scanner;

public class arr {
public static void main(String[] args) {
	

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the array size");
	int num  =sc.nextInt();
	int a [] = new int[num];
  int temp=0,i,j;
  
  System.out.print("Enter "+ num + "number of array element::");
	for(i=0;i<num;i++) 
	{
		a[i]=sc.nextInt();
	}
	
	System.out.println("all array element");
	for(i=0;i<num;i++) 
	{
		System.out.println(" "+ a[i]);
	}
	for(i=0;i<num;i++) 
	{
		for(j=i+1;j<num;j++) 
		{
			if  (a[i]>a[j]) 
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	System.out.println("array in acsseding order");
	for(i=0;i<num;i++) 
	{
		System.out.println(" "+a[i]);
	}
}	
}
