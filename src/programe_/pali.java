package programe_;

import java.util.Scanner;

public class pali {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("enter String");
	String str=sc.next();
	
	
	String org_str=str;
	String rev="";
	int len=str.length();
	
	for(int i=len-1;i>=0;i--)
	{
		rev=rev+str.charAt(i);
	}
	if(org_str.equals(rev)) {
		System.out.println(" String is palindrone");
	}
	else 
	{
		System.out.println("String is not palindrone ");
	}
}
}
