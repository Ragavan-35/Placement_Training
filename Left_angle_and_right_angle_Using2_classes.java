/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;
class Leftangle{
    
    public void leftTriangle(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            
        }
        System.out.println();
        
    }
    }
}
class Rightangle{
    
  public void rightTriangle(){
        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
                
            
        }
        for(int k=1;k<=i;k++){
            System.out.print("*");
        }
        System.out.println();
        
    }
    
}
}


        
      
        
    
    
    class Main
{
	public static void main(String[] args) {
		Leftangle add=new Leftangle();
		
		add.leftTriangle();
		Rightangle add1=new Rightangle();
		add1.rightTriangle();
		
		
	}
}