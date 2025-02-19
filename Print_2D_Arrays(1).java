/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        

        
        int rows = 3;
        int cols =3;
        
        int[][] array = new int[rows][cols];

        
        System.out.println("Enter values for a 3x3 matrix:");

        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print("Enter value for position (" + i + ", " + j + "): ");
                array[i][j] = scanner.nextInt();  
            }
        }

        // Print the 2D array to see the entered values
        System.out.println("Here is your 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");  
            }
            
            System.out.println();  
        }
        
    }
}
