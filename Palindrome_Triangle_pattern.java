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
	    //int num=1;
	    Scanner scn=new Scanner(System.in);
	   
	    int n=scn.nextInt();
	   for(int i=1;i<=n;i++){
	       for(int j=1;j<=n-i;j++)System.out.print("  ");
	       for(int j=i;j>=1;j--)System.out.print(j +" ");
	       for(int k=2;k<=i;k++)System.out.print(k +" ");
	       System.out.println();
	   }
	          
	    
	    
		
	}
}
