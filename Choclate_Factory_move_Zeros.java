//Move Zeros
public class Main{
    public static void main(String[] args) {
        int[] nums={1,0,2,0,4,3};
        int x=nums.length;
        int ans[]=new int[x];
        int index=0;
        for(int i=0;i<x;i++) {
            if (nums[i] != 0) {
                ans[index] = nums[i];
                index++;
                ;
            }
        }
            while(index<x){
                ans[index]=0;
                index++;

            }
            for(int i=0;i<x;i++){
                System.out.println(ans[i]);
            }


    }
}
