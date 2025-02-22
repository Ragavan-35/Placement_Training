/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Base{
    public void baser1(){
        System.out.println("It is public");
    }
    private void baser2(){
        System.out.println("It is private");
    }
    protected void baser3(){
        System.out.println("It is protetced");
    }
    void baser4(){
        System.out.println("It is Default");
    }
}
class Base_1 extends Base{
     public void baser1(){
        System.out.println("It is publicccc");
    }
    protected void baser3(){
        System.out.println("It is protectdddd");
    }
    void baser4(){
        System.out.println("It is defaulttt");
    }
    //private method can"t access 
     /*private void baser2(){
        System.out.println("It is privateeeee");
    }*/
    
} 
public class Main
{
	public static void main(String[] args) {
		Base obj=new Base_1();
		obj.baser2();

}
}
