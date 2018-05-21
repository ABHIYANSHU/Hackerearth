package hackerearth;

import java.util.Scanner;

/**
 * @author Abhinav Srivastava
 */
public class MinMax {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		int sum=0;
		
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
			sum=sum+arr[i];
		}
		
		System.out.println((sum-max)+" "+(sum-min));
		
		sc.close();
	}
}
