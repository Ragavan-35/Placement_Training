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
	    Scanner scan=new Scanner(System.in);
	    System.out.println("Enter the number");
	    int x=scan.nextInt();
	    System.out.println("Enter the range");
	    int n=scan.nextInt();
	    int count=0;
	    int add=0;
	    for(int i=1;i<=n;i++){
	        count=count*10+x;
	        add+=count;
	         System.out.println(count+"+");
	    }     
	        
	        
	        
	        
	  
	        System.out.print("Sum of the numbers"+ "=" +add);
	        
	    
		
	}
}
