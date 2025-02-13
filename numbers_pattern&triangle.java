/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
	    int a=5;
	    for(int i=1;i<=a;i++){
	        {
	           
	            for(int k=2;k<=i;k++){
	                System.out.print(k);
	            }
	            System.out.println();
	        }
	    }
	    int n = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= 1; j--) {
                if (j <= i) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            for (int k = 2; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
        
	    

	}
	
}