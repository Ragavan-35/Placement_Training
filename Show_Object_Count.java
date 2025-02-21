/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Counter {
	static int count=0;
	static void display() {
		count++;
		System.out.println("Object Count is="+count);


	}
}

public class Main
{
	public static void main(String[] args) {
		Counter.display();
		Counter.display();
		Counter.display();


	}
}