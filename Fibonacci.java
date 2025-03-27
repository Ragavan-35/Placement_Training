import java.util.Scanner;
class Fibonacci{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the Range");
        int input= scan.nextInt();
        int a=0;
        int b=1;
        int nextTerm;
        System.out.print(a +" "+b+" ,");
        for(int i=2;i<input;i++){
            nextTerm=a+b;
            a=b;
            b=nextTerm;
            System.out.print(nextTerm+" ,");
        }


    }
}
