package last_revision;

import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the numnber");
	int pr =sc.nextInt();
	
	
	int fact=1;
	for(int i=1;i<=pr;i++) 
	{
		fact=fact*i;
	}
	System.out.println("factorial of "+ pr +" is "+ fact);
  }
  
 }
