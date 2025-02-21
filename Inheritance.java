/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

******************************************************************************/
class Sum{
    private int a=10;
    private int b=10;
    public int get_a(){
        return a;
    }
    public int get_b(){
        return b;
    }
}
class Sum1 extends Sum{
    int c;
    void display(){
        c=get_a()+get_b();
        System.out.println("The Sum is = "+ c);
    }
}
public class Main
{
	public static void main(String[] args) {
		Sum1 obj=new Sum1();
		obj.display();
	}
}