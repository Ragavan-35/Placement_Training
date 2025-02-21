/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Pattern{
    static class Inner_pattern{
        static int n=5;
        static void display(){
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    if(j%2==0){
                    System.out.print(" #");
                }else{
                     System.out.print(" *");
                }
                 
            }System.out.println();
           
            
        }
        }
}
}
    
public class Main
{
	public static void main(String[] args) {
	Pattern.Inner_pattern.display();
	}
}