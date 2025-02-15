/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int n=5;
		int res;
		int var1=1;//3
		int var2=1;//2
		for(int i=1;i<=n;i++){
		    for(int j=n-0;j>i;j--)System.out.print(" ");
		  
		    
		 for(int k=1;k<=var1;k++){
		         res=k-var2;
		     if(res<0){
		        res=res*(-1);
		    }
		    
		  System.out.print(res);
		 }
		         
		  
		            
		        
		        var1=var1+2;
		        var2=var2+1;
		        System.out.println();
		    }

		    
		    
		
	}
}
