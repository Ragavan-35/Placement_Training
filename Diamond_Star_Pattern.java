/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int n=6;
		for(int i=1;i<=6;i++){
		    for(int j=1;j<=(n-i);j++){
		        System.out.print(" ");
		    }
		    for(int k=1;k<=(2*i)-1;k++){
		        System.out.print("*");
		    }System.out.println();
		  
		}
		int n1=6;
		for(int i=5;i>=1;i--){
		    for(int j=1;j<=(n-i);j++)System.out.print(" ");
		    for(int k=1;k<=(2*i)-1;k++)System.out.print("*");
		    	System.out.println();
		} 
		//System.out.println();
		
	}
	
	}