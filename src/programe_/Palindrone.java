package programe_;

import java.util.Scanner;

public class Palindrone {

	public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.println("enter the number::");
   
   int num = sc.nextInt();
   
  
   int rev=0;
   int org_num=num;
   
   while (num!=0) 
   {
	   rev=rev*10+num%10;
	   num=num/10;
   }

   if(org_num==rev) 
   {
	   System.out.println("Number is palindrone");
   }
   else 
   {
	   System.out.println("Number is not palindrone");
   }
   
	}

}
