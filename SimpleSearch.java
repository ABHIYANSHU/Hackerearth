package hackerearth;

import java.util.Scanner;

/**
 * @author Abhinav Srivastava
 */

public class SimpleSearch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i]=sc.nextInt();
		}
		int search=sc.nextInt();
		int l=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==search)
				l=i;
		}
		System.out.println(l);
		sc.close();
	}
}