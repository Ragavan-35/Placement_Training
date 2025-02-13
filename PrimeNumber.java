/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
class Main{
    public static void main(String[] args) {
        boolean isprime=true;
        System.out.println("Please enter the number");
        Scanner scn=new Scanner(System.in);
        int input_number=scn.nextInt();
        if(input_number<=1){
            isprime=false;
        }else{
            for(int i =2; i<input_number;i++) {

                int result = input_number % i;
                if(result==0){
                    isprime=false;

            }
            }
                if(isprime){
                    System.out.println("PrimeNumber");
                }else{
                    System.out.println("not a Prime Number");
                }
            
        }
    }
}