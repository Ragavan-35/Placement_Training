/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
import java.util.*;

public class Index_finder {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        int a[]={1,2,3,4,6};
         System.out.println("Enter the Addition :");
        int n=scan.nextInt();
        for(int i=0;i<a.length;i++){
            for(int j=1;j<a.length;j++){
                int add=a[i]+a[j];
                if(add==n){
                    System.out.println(i);
                    System.out.println(j);
                    
                }
            }
            
        }
    }
}

