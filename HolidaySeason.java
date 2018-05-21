package hackerearth;

/**
 * @author Abhinav Srivastava
 */

import java.util.Scanner;

public class HolidaySeason {
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			sc.nextLine();
			char[] arr=new char[n];
			String s=sc.next();
			for(int i=0;i<n;i++) {
				arr[i]=s.charAt(i);
			}
			long ans;
			ans=0;
			long now;
			int cnt[]=new int[26];
			for(int i=0;i<26;i++)
				cnt[i]=0;
			for(int i=0;i<n-1;i++) {
				now=0;
				for(int j=i+1;j<n;j++) {
						if(arr[i]==arr[j]) {
							ans+=now;
						}
						now+=cnt[arr[j]-'a'];
					}
				cnt[arr[i]-'a']++;
			}
			System.out.println(ans);
       sc.close();
	}
}