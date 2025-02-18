/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

***********************
{********************************************************/
import java.util.*;
public class Main{
	public static void main(String[] args) {
	int arr[]={1,2,0,5,5,0,9,0};
	int temp[]=new int[arr.length];
	int j=0;
	for(int i=0;i<arr.length;i++){
	    if(arr[i]!=0){
	        temp[j]=arr[i];
	        j++;
	    }
	    
	}
	System.out.println(Arrays.toString(temp));
	
	}
}
