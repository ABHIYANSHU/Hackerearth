package hackerearth;

import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @author Abhinav Srivastava
 */
public class NormalType {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[] arr = new int[n+1];
	    
		for(int i=1; i<=n; i++)
	           arr[i] = sc.nextInt();
	 
	    TreeSet<Integer> uniqueNo = new TreeSet<>();
	    
	    for(int i=1; i<=n; i++)
	        uniqueNo.add(arr[i]);
	       
	    int size = uniqueNo.size();
	    TreeMap<Integer, Integer> map = new TreeMap<>();
	       
	    int index = 1;
	    
	    for(int i: uniqueNo)
	        map.put(i, index++);
	       
	    for(int i=1; i<=n; i++)
	        arr[i] = map.get(arr[i]);
	 
	    int[] times = new int[n+1];
	    int uniqueNoCtr = 0 ;
	    int ptr = 1 ;
	    int subPtr = 0 ;
	    long ans = 0 ;
	       
	    while(ptr<=n) {
	       while(uniqueNoCtr != size && subPtr<n) {
	           subPtr++;
	           if(times[arr[subPtr]] == 0)
	               uniqueNoCtr++;
	               times[arr[subPtr]]++;
	           }
	           if(uniqueNoCtr == size)
	               ans += (n-subPtr+1);
	           if(times[arr[ptr]] == 1)
	               uniqueNoCtr--;
	           times[arr[ptr]]--;
	           ptr++;
	       }
	       System.out.println(ans);
		sc.close();
	}
}
