/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	    //Sum Of Natural numbers using While Loop
	    Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		int rev=0;
		
	
	
		while(a>0){
		    int m=a%10;//m=3
		  
		  
		    rev=rev*10+m;//3,2,
		    
		    a=a/10;//12,1
		    }
		     
		    
		    
		    
	
		    
		  System.out.println("Reverse Number:"+rev);
		
	}
		
}
