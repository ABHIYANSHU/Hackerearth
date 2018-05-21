package hackerearth;

import java.util.Scanner;

/**
 * @author Abhinav Srivastava
 *
 */
public class RestInPeace {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
			String s = ""+arr[i];
			if(arr[i]%21==0||s.contains("21"))
				System.out.println("The streak is broken!");
			else
				System.out.println("The streak lives still in our heart!");
		}
		
		sc.close();
	}
}
