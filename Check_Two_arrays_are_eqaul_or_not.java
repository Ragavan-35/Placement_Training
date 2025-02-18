/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int a[]={1,1,1,1,0};
		int b[]={1,1,0,1,1,0};
		int count=0;
		int n=a.length;
		for(int i=0;i<n;i++){
		    
		        if(a[i]==b[i]){
		           
		            count++;
		        }
		        
		        if(count==n){
		            System.out.println("yes");
		        }else{
		            System.out.println("No");
		        } 
		    
		        
		}
	}
}
