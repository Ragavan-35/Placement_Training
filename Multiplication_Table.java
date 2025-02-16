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
	    //Multiplication Table
	    Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		
		for(int i=1;i<=16;i++){
		    	int c=a*i;
	        	
		    
		    System.out.println(i + "*" + a +"="+c);
		}
	}
}
