/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Row & Column Size of Matrix: ");
        int rows = input.nextInt(), cols = input.nextInt();
        int[][] matrix = new int[rows][cols];

        System.out.println("Enter matrix elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        sortMatrixUsingList(matrix);
        displayMatrix(matrix);
        input.close();
    }

    
    static void sortMatrixUsingList(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        
        List<Integer> list = new ArrayList<>();
        for (int[] row : matrix) {
            for (int val : row) {
                list.add(val);
            }
        }

        
        Collections.sort(list);
        
        

        
        Iterator<Integer> it = list.iterator();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if(it.hasNext()) {
                    matrix[i][j] = it.next();
                }
            }
        }
    }

    
    static void displayMatrix(int[][] matrix) {
        System.out.println("\nSorted Matrix:");
        for (int[] row : matrix) {
            System.out.print("| ");
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println("|");
        }
    }
}
