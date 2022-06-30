package programe_;

import java.util.Scanner;

public class ArmStrong_number {
public static void main(String[]args) 
{
           Scanner sc = new Scanner(System.in);
            System.out.println("Enter the number::");
            int num = sc.nextInt();

            int rem; 
            int c=num;
            int arm =0;

            while( num>0) 
               {
                 rem=num%10;
                arm=(rem*rem*rem)+arm;
                 num=num/10;
                }
            if(c==arm) 
            {
	        System.out.println("Number is armstrong");
	}
else 
{
System.out.println("Number is not armstrong");	
} 
	

     }
 }
