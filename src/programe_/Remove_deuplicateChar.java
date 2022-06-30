package programe_;

import java.util.Scanner;

public class Remove_deuplicateChar {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the String:  ");
    String w= sc.nextLine();

    
    String nw =" ";
    
    System.out.println("Original String: "+ w);
    for(int i=0;i<w.length();i++) 
    {
    	char pq =w.charAt(i);  //a  aaa b   
    	if(pq!=' ') 
    	{
    		nw=nw+pq;
    		w = w.replace(pq,' '); //aa bb bb  vvb
    		
    	}
    }
    System.out.println("New word : " +nw);
}
}
