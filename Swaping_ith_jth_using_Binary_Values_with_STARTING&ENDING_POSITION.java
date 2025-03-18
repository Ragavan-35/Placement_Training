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
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the input");
		int number=scan.nextInt();
		int[] binary=new int[32];
		int size=binary.length;
		int index=0;
		if(number==0) {
			return;
		}
		while(number>0) {
			binary[index]=number%2;
			number/=2;
			index++;
		}
		System.out.println("binary Value is=");
		for(int i=0; i<32; i++) {
			System.out.print(binary[i]);
		}
		System.out.println();
		System.out.println("enter a Starting position=");
		int start=scan.nextInt();
		System.out.println("Enter ending position=");
		int end=scan.nextInt();


		int temp=binary[start];
		
		binary[start]=binary[end];
		
		binary[end]=temp;



		System.out.println();
		System.out.println("Swaped binary Value is=");
		for(int i=0; i<32; i++) {
			System.out.print(binary[i]);
		}


	}
}
