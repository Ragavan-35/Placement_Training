/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		String word="RAGAVAN";
		int n=word.length();
		char[] rev=word.toCharArray();
		
		int i=0;
		int j=n-1;
		while(i<j){
		    char temp=rev[i];
		    rev[i]=rev[j];
		    rev[j]=temp;
		    i++;
		    j--;
		}
		System.out.println(rev);
	}
}
