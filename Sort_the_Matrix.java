import java.util.Arrays;
public class Main
{

	public static void main(String[] args) {
		int [][] arr  = {{5,4,7},{1,8,3},{9,6,2}};
		int n = arr.length;
		int m = arr[0].length;
		int[] temp = new int[9];
		int s = temp.length;
		int ind = 0;
		
		
		for (int i = 0; i < n; i++) {
			for(int j =0; j<m; j++) {
				temp [ind]= arr[i][j];
				ind++;
			}
		}
		
		
		for (int i = 0; i < s; i++) {
			for (int j = i+1; j < s; j++) {
				if(temp[i]>temp[j]) {
					int tep = temp[i];
					temp[i] = temp[j];
					temp [j]= tep;
				}
			}
		}
		
		
		System.out.println(Arrays.toString(temp));
		
		
		int ind1=0;
		for (int i = 0; i <n; i++) {
			for (int j = 0; j <m; j++) {
				arr[i][j] = temp[ind1];
				ind1++;
			}
		}
	}
}