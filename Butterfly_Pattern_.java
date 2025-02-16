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
	    int n=scan.nextInt();
	    for(int i=1;i<=n;i++){
	        //upper case
	        //left Stars
	        
	        for(int j=1;j<=i;j++)System.out.print("*");
	        //center space
	        for(int k=1;k<=(n-i)*2;k++)System.out.print(" ");
	        //right stars
	        
	        for(int j=1;j<=i;j++)System.out.print("*");
	         System.out.println();
              
	        //System.out.println();
	        
	    }
	    for(int i=1;i<=n;i++){
	        //lower case :
	        //left Stars
	        for(int j=1;j<=n-i;j++)System.out.print("*");
	        //center spaces
	        for(int a=1;a<=(i*2);a++)System.out.print(" ");
	        //Right stars
	        for(int k=1;k<=n-i;k++)System.out.print("*");
	        System.out.println();
	    }
            
	    
	    
	    
             
	          
	    
	 
	   
		
	}
}
