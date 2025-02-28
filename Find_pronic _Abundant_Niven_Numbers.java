//Find pronic ,Abundant,Niven Numbers
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Number");
        int n= input.nextInt();
        boolean flag=false;

        for(int i=2;i<n;i++){


            if(i*(i+1)==n){
                //System.out.println(i);
                flag=true;

            }

        }
        if(flag){
            System.out.println("it is pronic number");
        }else{
            System.out.println("it is not pronic number");
        }
        int sum=0;
        for(int j=2;j<n;j++){


            if(n%j==0){


                sum=j+sum;
            }

        }
        if(sum>n){
            System.out.println("it is Abundant");
        }else{
            System.out.println("it is not Abundant");
        }
        int mod;
        int sum2=0;
        int x=n;
        while(x>0){
            mod=x%10;
            sum2=sum2+mod;
            x=x/10;

        }

        if(n%sum2==0){
            System.out.println("it is Niven Number");
        }else{
            System.out.println("it is not Niven Number");
        }




    }
}
