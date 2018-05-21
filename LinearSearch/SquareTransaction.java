package hackerearth;

import java.util.Scanner;

/**
 * @author Abhinav Srivastava
 */
public class SquareTransaction {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		int sum[] = new int[n];
		
		for(int i=0;i<n;i++) {
			sum[i]=0;
			arr[i] = sc.nextInt();
		}
		
		sum[0]=arr[0];
		
		for(int i=1;i<n;i++) {
			sum[i]=sum[i-1]+arr[i];
		}
		
		int q = sc.nextInt();
		int query[] = new int[q];
		
		for(int i=0;i<q;i++) {
			int k=0;
			query[i] = sc.nextInt();
			for(int j=0;j<n;j++) {
				if(sum[j]>=query[i]) {
					System.out.println(j+1);
					k=0;
					break;
				}
				else {
					k=1;
				}
			}
			if(k==1) {
				System.out.println("-1");
			}
		}
		
		
		sc.close();
	}
}
