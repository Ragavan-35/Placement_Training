/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner scan=new Scanner(System.in);
	    int rows=3;
	    int cols=3;
	    int[][] arr=new int[rows][cols];
	    for(int i=0;i<rows;i++){
	        for(int j=0;j<cols;j++){
	            System.out.println("Enter the position("+i+","+j+")");
	            arr[i][j]=scan.nextInt();
	        }
	    }
	       System.out.print("the 2d Array is:");
	       for(int i=0;i<rows;i++){
	        for(int j=0;j<cols;j++){
	            System.out.print(arr[i][j]);
	        }
	        System.out.println();
	       }
	       int[] flatarr=new int[arr.length*arr[0].length];
	       int s=0;
	       for(int i=0;i<arr.length;i++){
	           for(int j=0;i<arr.length;j++){
	               flatarr[s++]=arr[i][j];
	           }
	       }
	       Arrays.sort(flatarr);
	       for(int i=0;i<arr.length;i++){
	           for(int j=0;i<arr[i].length;j++){
	               arr[i][j]=flatarr[s++];
	           }
	       }
	         System.out.print("the 2d Array is");
	         for(int i=0;i<arr.length;i++){
	             for(int j=0;j<arr[i].length;j++){
	                 System.out.println(arr[i][j]);
	             }
	             System.out.println();
	         }
	    
	  
	  
	   
 
	   
	   
	    
		
	}
}
