/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


public class Main
{
	public static void main(String[] args) {
		int a=10;
		
		int c=--a + a++ + ++a +--a;
		int d=a++ + ++a + ++a + a++;
		System.out.println(c);
		System.out.println(d);
	}
}