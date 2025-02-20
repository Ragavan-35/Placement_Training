/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
                
                
       Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;

public class Main
{
	public static void main(String[] args) {
	    //Remove Duplicate Array
	   
	    int a[]={1,1,3,43,2,3,4,1,2};
	  
	    int visit=-1;
	    for(int i=0;i<a.length;i++){
	        if(a[i]!=-1){
	            for(int j=i+1;j<a.length;j++){
	                if(a[i]==a[j]){
	                    a[j]=visit;
	                }
	                
	            }
	             System.out.println(a[i]);
	            
	        }
	         
	        
	    }
	    
		
	}
}