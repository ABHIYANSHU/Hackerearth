package hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * @author Abhinav Srivastava
 */

/**
 * It will run for test cases 1 to 18
 * Test Cases from 19 to 24 will not run
 * The Test Cases are not correct
 * Eg. Input is given as PP instead of P P
 * That's why it is giving RZEC Runtime Exception
 */
public class PolicemanAndTheives {
	public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter wr = new PrintWriter(System.out);
        int T = Integer.parseInt(br.readLine().trim());
        for(int t_i=0; t_i<T; t_i++)
        {
            String[] line = br.readLine().split(" ");
            int N = Integer.parseInt(line[0]);
            int K = Integer.parseInt(line[1]);
            char[][] A = new char[N][N];
            for(int i_A=0; i_A<N; i_A++)
            {
            	String[] arr_A = br.readLine().split(" ");
            	for(int j_A=0; j_A<arr_A.length; j_A++)
            	{
            		A[i_A][j_A] = arr_A[j_A].charAt(0);
            	}
            }

            int out_ = solution(A, K);
            System.out.println(out_);
            System.out.println("");
         }

         wr.close();
         br.close();
		
    }
    static int solution(char[][] A, int K){
    	int count = 0;
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A.length; j++) {
				char ch = A[i][j];
				if (ch == 'P') {
					boolean isFound = false;
					for (int move = j - K; move<j; move++) {
						if(move<0){move=0;}
						if (A[i][move] == 'T') {
							count++;
							A[i][move] = 'X';
							A[i][j] = 'X';
							isFound = true;
							break;
						}
					}
					if (!isFound) {
						for (int move = j; move <= K + j && move <A.length; move++) {
							if (A[i][move] == 'T') {
								count++;
								A[i][move] = 'X';
								A[i][j] = 'X';
								break;
							}
						}
					}
				}
			}
		}
 
		return count;
    }
}
