/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
   
{
    //Find Car rent
   
  static class CarRental{
       Scanner scan=new Scanner(System.in);
       int carId;
       String carType;
      
        
        void getcar(int Carno){
            System.out.println("CarNum:"+Carno);
            System.out.println("Enter the CarId");
            carId=scan.nextInt();
            scan.nextLine();
            System.out.println("Enter the CarType");
            carType=scan.nextLine();
            
        }
        void getRent(){
            String smallcarRent="1000";
            String vanRent="800";
            String suvRent="2500";
            if(carId==1 && carType.equalsIgnoreCase("smallCar")){
                System.out.println("The Car rent is :" +smallcarRent);
                
            }
            else if(carId==2 && carType.equalsIgnoreCase("van")){
                System.out.println("The Car rent is :" +vanRent);
            }
                
            
            else if(carId==3 && carType.equalsIgnoreCase("suv")){
                System.out.println("The Car rent is :" +suvRent);
            }else{
                System.out.println("Invalid Car Id Or Type");
            }
                
            
        }
      
    }
	public static void main(String[] args) {
	    CarRental car=new CarRental();
	    for(int i=1;i<=3;i++){
	    car.getcar(i);
	    car.getRent();
	        
	    }
	     
	   
	}
}
