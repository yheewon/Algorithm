package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


public class test {
	
	static int findParent(int a, int[] num) {
		if(a==num[a]) return a;
		else return num[a] = findParent(num[a],num);
	}
	
	static void union(int a, int b,int[] num) {
		a = findParent(a,num);
		b = findParent(b,num);
		
		if(a<b) num[b] = a;
		else if(a>b) num[a] = b;
		
	}
	
	static void find(int a,int b, int[] num) {
		a = findParent(a,num);
		b = findParent(b,num);
		
		if(a==b) System.out.println("YES");
		else System.out.println("NO");
	}
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine()," ");
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		int[] num = new int[n+1];
		
		for(int i=0;i<num.length;i++) num[i] = i;
			
		for(int i=0;i<m;i++) {
			st = new StringTokenizer(br.readLine()," ");
			int[] arr = new int[3];
			for(int j=0;j<3;j++) arr[j] = Integer.parseInt(st.nextToken());
			
			if(arr[0]==0) union(arr[1],arr[2],num);
			else find(arr[1],arr[2],num);
		}
	}

}





