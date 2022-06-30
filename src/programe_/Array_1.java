package programe_;

import java.util.Scanner;

public class Array_1 {
	
public static void main(String[] args) {
	int a[]= new int[5]; int temp=0;       // 90 87 84 56 10 
	Scanner sc = new Scanner(System.in);   // i  j 
	System.out.println("Enter the Array of element::");
	
	for(int i=0;i<5;i++) 
	{
		a[i]= sc.nextInt();
		
	}
	for(int i=0;i<5;i++) 
	{
		for(int j=i+1;j<5;j++) 
		{
			if(a[i]>a[j]) 
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
		}
	}
	for(int i=0;i<5;i++) 
	{
		System.out.println(a[i]+" ");
	}
}
}
