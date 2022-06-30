package programe_;

import java.util.Scanner;

public class Strinng {
public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   System.out.println("enter String");
       String str = sc.next();
       String orgstr=str;
       
       String rev="";
       int p =str.length();
       for(int i=p-1;i>=0;i--) 
       {
    	   rev=rev+str.charAt(i);
       }
       if(orgstr.equals(rev)) 
       {
    	   System.out.println("String is palindrone");
       }
       else 
       {
    	   System.out.println("Stringn is not palindrone");
       }
}
}
