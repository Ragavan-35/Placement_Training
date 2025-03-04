/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class StringMethods{
    void stringbuilder(){
    //Using StringBuilfders
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a string  ");
    String string=input.nextLine();
    String reversed=new StringBuilder(string).reverse().toString();
    
    if(string.equals(reversed)){
        System.out.println("It is Palindrome");
    }else{
        System.out.println("It is not a Palindrome");
    }
    }
    void stringBuiltIn(){
         Scanner input=new Scanner(System.in);
	    System.out.println("Enter a String 1");
	    String name=input.nextLine();
	    
	        String reverse="";
	        for(int i=name.length()-1;i>=0;i--){
	            reverse=reverse+name.charAt(i);
	        }
	        if(name.equals(reverse)){
	            System.out.println("it is Palindrome");
	        }else{
	            System.out.println("it is not a Palindrome");
	        }
    }
     void stringbuffer(){
    //Using StringBuffer
    Scanner input=new Scanner(System.in);
    System.out.println("Enter a String 2  ");
    String string=input.nextLine();
    String reversed=new StringBuffer(string).reverse().toString();
    
    if(string.equals(reversed)){
        System.out.println("It is Palindrome");
    }else{
        System.out.println("It is not a Palindrome");
    }
    }
    
	        
    
    
    
    
}
public class Main
{
	public static void main(String[] args) {

	        
	        StringMethods odj=new StringMethods();
	        odj.stringBuiltIn();
	        odj.stringbuffer();
	        odj.stringbuilder();
	    
		
	}
}
