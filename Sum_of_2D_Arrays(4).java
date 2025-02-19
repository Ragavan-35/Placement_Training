/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int[][] arr=new int[4][3];
	int sum=0;
	for(int i=0;i<arr.length;i++){
	    for(int j=0;j<arr[i].length;j++){
	        System.out.println("Enter the position("+i+","+j+")");
	        arr[i][j]=scan.nextInt();
	    }
	}
	System.out.println("the 2d Array is");
	for(int i=0;i<arr.length;i++){
	    for(int j=0;j<arr[i].length;j++){
	        System.out.print(arr[i][j]);
	    }
	
	    System.out.println();
	}
	//Sum of 2D Arrays
		System.out.println("Sum of 2d arrays:");
	for(int i=0;i<arr.length;i++){
	    for(int j=0;j<arr[i].length;j++){
	        sum+=arr[i][j];
	    }
	
	}
	    System.out.println(sum);
	}
}