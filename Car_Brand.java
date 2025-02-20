/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    static class Car{
        String brand;
        Car(){
            String brand="unknown";
            System.out.println("The brand is:" +brand);
       
        }
        void setBrand(){
            
           brand="Audi";
           System.out.println("The brand is:" +brand);
        }
    }
	public static void main(String[] args) {
		Car car=new Car();
		car.setBrand();
	}
}
