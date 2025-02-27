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
		Scanner input=new Scanner(System.in);
		int n=input.nextInt();
		int check=1;
		int x=n;
		while(x>0){
		    check=check*10;
		    x=x/10;
		}
		int temp=(n*n)%check;
		if(n==temp){
		    System.out.println("it is Automorphic");
		}else{
		    System.out.println("it is not Automorphic");
		}
		
	}
}
