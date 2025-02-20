/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
   static class Counterclass{
        static int count=0;
        
        Counterclass(){
            count++;
            
            System.out.println("Object  is  created:"+count);
            
        }
        
    }
	public static void main(String[] args) {
	    for(int i=1;i<=4;i++){
		Counterclass counter=new Counterclass();
	    }
	     counter=new Counterclass();
	    
		
	}
}
