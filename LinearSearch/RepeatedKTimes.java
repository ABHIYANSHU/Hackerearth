package hackerearth;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

/**
 * @author Abhinav Srivastava
 */
public class RepeatedKTimes {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		HashSet<Integer> hs = new HashSet<>();
		
		int count[] = new int[100002];
		Arrays.fill(count, 0);
		
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			hs.add(arr[i]);
			count[arr[i]]++;
		}
		int k = sc.nextInt();
		
		for(int i:hs) {
			if(count[i]==k) {
				System.out.println(i);
				break;
			}
		}
		
		sc.close();
	}
}
