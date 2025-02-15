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
	    int flag;
	    Scanner scn=new Scanner(System.in);
	    System.out.println("Enter the range");
	    int a=scn.nextInt();
	    Scanner scn1=new Scanner(System.in);
	    System.out.println("Enter the range1");
	    int b=scn1.nextInt();
	    
	    for(int i=a;i<b;i++){
	        if(i==1 || i==0) continue;
	        flag=1;
	        for(int j=2;j<i;j++){
	            if(i%j==0){
	                flag=0;
	                break;
	            }
	        }
	        if(flag==1){
	            System.out.println(i);
	        }
	            
	        
	    }
	}
}

