package hackerearth;

import java.util.Scanner;

/**
 * @author Abhinav Srivastava
 */
public class MonkTakesAWalk {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			int count = 0;
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				if(s.charAt(j)=='A'||s.charAt(j)=='E'||s.charAt(j)=='I'||s.charAt(j)=='O'||s.charAt(j)=='U'||s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u')
					count++;
			}
			System.out.println(count);
		}
		
		sc.close();
	}
}