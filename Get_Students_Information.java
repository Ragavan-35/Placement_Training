/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.
*/
import java.util.Scanner;

public class Main {

    static class Student {
         //Get Students Information
        void display(int studentNumber) {
           
            
            Scanner scan = new Scanner(System.in);
           
            System.out.println("Student"+" "+"Number:"+studentNumber);
            System.out.print("Enter name: ");
            String name = scan.nextLine();
            System.out.print("Enter id: ");
            int id = scan.nextInt();
            scan.nextLine();
            System.out.println("Name: " + name + ", ID: " + id);
        }
    }

    public static void main(String[] args) {
        Student a = new Student();
        for(int i=1;i<=5;i++){
        a.display(i);
        }
    }
}
