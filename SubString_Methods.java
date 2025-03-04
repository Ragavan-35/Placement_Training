/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Substring{
    
 void stringObject(){
	        
	    
	String name="Ragavvvv";
	String str=name.substring(3,5);
	System.out.println(str);
	}
	  
	  
void stringBuilder(){
	        
	    
	String name="Ragavvvv";
	String str=new StringBuilder (name).substring(3);
	System.out.println(str);
	}
void stringBuffer(){
	        
	    
	String name="Ragavvvv";
	String str=new StringBuffer (name).substring(3,6);
	System.out.println(str);
	}
}
public class Main
{
	public static void main(String[] args) {
	    Substring obj=new Substring();
	    obj.stringObject();
	    obj.stringBuilder();
	    obj.stringBuffer();
   
	
	}
}
