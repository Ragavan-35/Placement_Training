/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
abstract class BankAccount {
	Scanner input=new Scanner(System.in);
	private int acctNum;
	private int balance;


	static int intrestRate=5;
	abstract void calcIntrest();

	public int get_a() {
		Scanner input=new Scanner(System.in);
		acctNum=input.nextInt();

		return acctNum;

	}
	public int get_b() {
		Scanner input=new Scanner(System.in);
		balance=input.nextInt();

		return balance;
	}


	public void BankAccount() {
		int a=get_a();
		int b=get_b();



	}
}
class SavingsAccount extends BankAccount {
	int a=get_a();
	int b=get_b();
	
	void calcIntrest() {
double rate=(b/12)*intrestRate;
System.out.println("Account intrestRate ="+rate);
	}
	void display() {
		System.out.println("It is Savings Account Number ");

		System.out.println("Account Number ="+a);
		System.out.println("Account balance ="+b);
		System.out.println("Account intrest ="+intrestRate);
		//System.out.println("Account intrestRate ="+intrestRate);
		

	}
}
class CurrentAccount extends BankAccount {
	int a=get_a();
	int b=get_b();
	void calcIntrest() {
	    double rate=(b/12)*intrestRate;
	    System.out.println("Account intrestRate ="+rate);


	}
	void display() {
		System.out.println("It is Current Account Number ");

		System.out.println("Account Number ="+a);
		System.out.println("Account balance ="+b);
		//System.out.println("Account intrest ="+intrestRate);
		

	}
}
public class Main
{
	public static void main(String[] args) {
		SavingsAccount obj=new SavingsAccount();
		obj.display();
		obj.calcIntrest();
		CurrentAccount obj1=new CurrentAccount();
		obj1.display();
		obj1.calcIntrest();



	}
}
