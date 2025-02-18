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
	int arr[]={1,0,1,1,1,0,1,0,1,0,0,1,0,1,0,1,1,1,1,0,1,1};
	int count=0;
	int max=0;
	for(int i=1;i<arr.length;i++){
	    if(arr[i]==1){
	        count++;
	    }else count=0;
	    if(max<count){
	        max=count;
	    }
	}
	System.out.println(max);

	}
}
