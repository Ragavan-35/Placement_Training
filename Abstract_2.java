
import java.util.*;  
 abstract class Circle{
     
     
     
     static void Calc_Area(){
         Scanner scan=new Scanner(System.in);
         double r;
         r=scan.nextInt();
         
         System.out.println("Area of the circle="+ 3.14*(r*r));
         
         
     }
     static void perimeter(){
         Scanner scan=new Scanner(System.in);
         double c;
         c=scan.nextInt();
         
         System.out.println("Perimeter ="+2*3.14*c);
         
     }
     
    
    
}





public class Main

{
	public static void main(String[] args) {  
	    Circle.Calc_Area();
	    Circle.perimeter();
	    
	    
	    
	}
}
