package test;

import java.util.*;

public class test {	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = 0;
		int M = 0;
		N = sc.nextInt();
		M = sc.nextInt();
		
		int arr[] = new int[N];
		for(int i=0;i<N;i++) arr[i] = sc.nextInt();
		
		int max = 0;
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					int plus = arr[i] + arr[j] + arr[k] ;
					if(plus>max && plus<=M) max = plus;
				}
			}
		}
		
		System.out.println(max);
		
	}

	
}
