package hackerearth;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * @author Abhinav Srivastava
 */

public class MannasFirstName {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < n; i++) {
			String s = br.readLine();
			int count1 = 0;
			int count2 = 0;
			int j;
			for (j = 0; j < s.length() - 3; j++) {
				if (s.charAt(j) == 'S' && s.charAt(j + 1) == 'U' && s.charAt(j + 2) == 'V' && s.charAt(j + 3) == 'O') {
					count1++;
				}
			}

			for (j = 0; j < s.length() - 6; j++) {
				if (s.charAt(j) == 'S' && s.charAt(j + 1) == 'U' && s.charAt(j + 2) == 'V' && s.charAt(j + 3) == 'O' && s.charAt(j + 4) == 'J' && s.charAt(j + 5) == 'I' && s.charAt(j + 6) == 'T') {
					count2++;
				}
			}
			int p = count1 - count2;
			System.out.println("SUVO = " + p + ", SUVOJIT = " + count2);
		}
		
		br.close();
	}
}
