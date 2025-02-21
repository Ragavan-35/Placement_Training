/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
  class Add{
        private int a,b,c;
        public void sum(){
            Scanner scan=new Scanner(System.in);
            System.out.println("Enter a");
            a=scan.nextInt();
            System.out.println("Enter b");
            b=scan.nextInt();
            c=a+b;System.out.println("C is="+c);
             
        }
    }

public class Main
{
   
	public static void main(String[] args) {
		Add a=new Add();
		a.sum();
	}
}
	
