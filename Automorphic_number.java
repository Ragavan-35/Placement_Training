import java.util.Scanner;
class AutomorphicNumber{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int input= scan.nextInt();
        int x=input;
        int count=0;
        int square=x*x;
        int auto=1;
        int divisor=1;
        while(x>0){
            count++;
            x=x/10;
        }
        for(int i=0;i<count;i++){
            divisor=divisor*10;
        }
        int divid=square%divisor;
        if(input == divid){
            System.out.println("its Automorphic NUmber");
        }else{
            System.out.println("it non automorphic Number");
        }
    }
}
