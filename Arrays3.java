/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[]={1,1,0,1,1,0,0,1,0,1,1,1};
		int count=0;
		int prev=0;
		int n=arr.length;
		for(int i=0;i<n;i++){
		if(arr[i]!=0){
		    arr[count]=arr[i];
		    count++;
		}
		}
		while(count<n){
		    arr[count++]=0;
		}
		    
		
		    System.out.println(Arrays.toString(arr));
		    
		
	}
}
