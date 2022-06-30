package last_revision;

import java.util.Scanner;

public class FAct6o {
public static void main(String[]arg)


   {
 	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the number");
	int pz = sc.nextInt();
	int fact=1;
	for(int i=1;i<=pz;i++) 
	{
		fact=fact*i;
	}
	
	System.out.println("factorial of "+ pz + " Is " + fact);
	}
}
