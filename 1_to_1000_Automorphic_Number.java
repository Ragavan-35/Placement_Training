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
		for(int i=1;i<=1000;i++){
		
		int x=i;
		int check=1;
		while(x>0){
		    check=check*10;
		    x=x/10;
		}
		int temp=(i*i)%check;
		if(i==temp){
		    System.out.println(i);
		}
	}
	}
}
