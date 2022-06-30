package programe_;

import java.util.Scanner;

public class Palindrone_st {
	public static void main(String[]arg){


		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String:");
		 String str =sc.next();
		String orgstr=str;
		String rev="";
		int p =str.length();
		for(int i=p-1;i>=0;i--)
		{

		rev=rev+str.charAt(i);

		}

		if(orgstr.equals(rev))
		{
		System.out.println("string is palindrone");

		}
		else 
		{
		System.out.println("string is not palindrone");
		}
}
}