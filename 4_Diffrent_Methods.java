/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
class Calculator{
    Scanner scan=new Scanner(System.in);
    public void odd(){
       int a,b;
        System.out.println("Enter a=");
         a=scan.nextInt();
        System.out.println("Enter b=");
        
         b=scan.nextInt();
         System.out.println("C is="+(a+b));
        
      
        
    }
    
    
      public int diff(){
        int a,b;
        System.out.println("Enter a=");
         a=scan.nextInt();
        System.out.println("Enter b=");
        
         b=scan.nextInt();
    
        return a-b;
        
    }
     public void prod(int a,int b){
        
        
        System.out.println("C is="+(a*b));
        
    }
    public int div(int a,int b){
        
       
        return (a/b);
        
        
    }
   
   
}
public class Main
{
	public static void main(String[] args) {
		Calculator add=new Calculator();
		
		add.odd();
		System.out.println(add.diff());
		add.prod(4,5);
		System.out.println(add.div(5,4));
		
		
	}
}