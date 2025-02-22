/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
 class Shape{
        protected int area;
        public void calculateArea(){
            System.out.println("Area =");
        }
    }
    class Circle extends Shape{
        private int a;
        
        public void calculateArea(){
             Scanner scan=new Scanner(System.in);
              System.out.println("Enter a= ");
              a=scan.nextInt();
             
            System.out.println("Area ="+a*a);
        }
        
        
        
    }
    class Square extends Shape{
         private double  r,d;
        
        public void calculateArea(){
             Scanner scan=new Scanner(System.in);
              System.out.println("Enter b= ");
              r=scan.nextInt();
              d=3.14*(r*r);
              
             
            System.out.println("Area ="+d);
        }
       
        
        
    }
public class Main
{
   
	public static void main(String[] args) {
	    Shape obj=new Square();
	    obj.calculateArea();
	    Shape obj1=new Circle();
	    obj1.calculateArea();
		
	}
}
