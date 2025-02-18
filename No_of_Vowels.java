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
	    System.out.println("Enter the String:");
	    String str=scan.nextLine();
	    int count=0;
	  
	    for(int i=0;i<str.length();i++){
	          char a=str.charAt(i);
	        if(a == 'a' || a == 'e' || a == 'i' || a== 'o' || a == 'u' || 
                a == 'A' || a == 'E' || a == 'I' || a == 'O' || a == 'U'){
                    count++;
                    
                }else count=0;
                
	    }
	    System.out.println("No of vowels:"+count);
	    

	}
}
