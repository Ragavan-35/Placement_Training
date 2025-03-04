
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a  String");
		String a=input.nextLine();
		//System.out.println("Orginal String:"+a);
		String[] result=a.split(" ");
		int m=result.length;

		StringBuilder rev=new StringBuilder();
		for(int i=m-1; i>=0; i--) {
			rev.append(result[i]);
			rev.append(" ");
			}
		System.out.println("Reversed String :"+rev.toString());
	
		
		int n=rev.length();
		for(int j=0;j<n-1;j++){
		    if(rev.charAt(j)==' '&& rev.charAt(j+1)==' '){
		        rev.deleteCharAt(j+1);
		    }
		    j--;
		    n--;
		}
		System.out.println(" After Reversed a String :"+rev.toString());

	}
}
