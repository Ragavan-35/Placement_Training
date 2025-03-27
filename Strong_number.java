import java.util.Scanner;
class StrongNumber{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int input= scan.nextInt();
        int x=input;
        int answ=0;
        int ans=1;
        while(x>0){
            int mod =x%10;
            for(int i=1;i<=mod;i++){
                ans=ans*i;
            }
            answ=ans+answ;
            x=x/10;
            ans=1;
        }
        if(input == answ){
            System.out.println("its strong NUmber");
        }else{
            System.out.println("it is not a Strong Number");
        }
    }
}
