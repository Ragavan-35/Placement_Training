/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        //Generate PrimeNumber
        Scanner scn = new Scanner(System.in);
        int prime =scn.nextInt();
        int count=0;
        //Create forloop
        for(int i=1;i<=prime;i++){
            if(prime%i==0){
                count++;
            }
        }
            if(count==2){
                System.out.println(prime +"it is a PrimeNumber");
            }else{
                System.out.println(prime +"it is not a PrimeNumber");
            }
    
    }
}