import java.util.*;  
  abstract class Circle{
    protected double area;
    abstract void calc_area();
}
class Area extends Circle{
    private double r;
    public Area(){
        Scanner scan=new Scanner(System.in);
        r=scan.nextInt();
    }
    
    void calc_area(){
        area=3.14*r*r;
        System.out.println("Area="+area);
        
    }
}




public class Main

{
	public static void main(String[] args) {  
	    Area obj=new Area();
	    obj.calc_area();
	    
	    
	    
	}
}
