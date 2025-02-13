/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/


public class Main
{
    public static void main (String[]args)
    {

        //variables initialization
        int num = 1234, reverse = 0, rem;


        //loop to find reverse number
        while (num != 0)
        {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num /= 10;
        };

        //output
        System.out.println ("Reversed Number: " + reverse);
        Boolean prime=Check_prime(23);
    }
    

    static boolean Check_prime(int val){
        boolean prime=true;
        for(int i=2;i<val;i++){
            if(val%i==0){
                System.out.println("not primenumber");
            }else{
                System.out.println("prime number");
            }
            
        }
        return prime;
    }
}	
	
	
	
