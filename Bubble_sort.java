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
		int nums[]={4,5,2,3,1,8};
		int size=nums.length-1;
		for(int i=0;i<size;i++){
		    for(int j=0;j<size;j++){
		        if(nums[i]<nums[j]){
		           int temp=nums[i];
		           nums[i]=nums[j];
		           nums[j]=temp;
		           
		        }
		        
		    }
		}System.out.println(Arrays.toString(nums));
	}
}
