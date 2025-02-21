/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
class Area{
     static int a;
     static Scanner scan=new Scanner(System.in);
     static void display(){
         System.out.println("Enter a=");
         a=scan.nextInt();
       System.out.println("The Area of Square="+a*a);
    }
    
    static void display(int l,int b){
       System.out.println("The Area of Rectangle="+l*b);
    }
    static void display(double r){
        
        
        double b=3.14;
        
       System.out.println("The Area of Circle="+b*(r*r));
    }
}
public class Main
{
	public static void main(String[] args) {
		Area.display();
		Area.display(2,3);
		Area.display(3);
}
}