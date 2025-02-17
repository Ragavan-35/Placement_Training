/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	int arr[]={1,2,3,4,5};
	/*for(int i=0;i<arr.length;i++){
	    System.out.print(i);
	}
	    /*for(int j:arr){
	        System.out.println(i);
	    }*/
	    
	    /*for(int k=arr.length-1;k>=0;k--){
	        System.out.println(k);
	    }*/
	    /*for(int i:arr){
	        i++;
	        System.out.println(i);
	    }
	    for(int i=0;i<arr.length;i++){
	        System.out.println(arr[i]);
	    }
	    for(int i=0;i<arr.length;i++){
	          System.out.println(arr[i]);
	    }*/
	//int arr[]={1,2,3,4,5};
	int max=arr[0];
	int max2=0;
	//int max3=0;
	for(int i=1;i<arr.length;i++){
	    if(arr[i]>max){
	        max=arr[i];
	       
	    }
	    max2=arr[i-1];
	    System.out.println(max);
	    System.out.println(max2);
	    
	     
	    
	}
	    
	}
	
	
}
