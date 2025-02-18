/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int a[]={5,18,17,4,6,7};
		int b[]={9,7,7,7,7};
		//int add;
		int j=0;
		int carry=0;
		
		int result[]=new int[a.length];
		for(int i=0;i<=a.length || j<b.length;i++){
		    int c=a[i]+b[j];
		    int d=c/10;
		    
		    int sum=a[i]+b[j]+carry;
		    carry=d;
		    
		    
		    
		   
		    result[i]=sum%10;
		    j++;
		    System.out.println(result[i]);
		    
		}
	
	}
}
