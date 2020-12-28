package Algorithm;

import java.util.*;

public class unionFind {
	//작은 값을 부모로 가짐
	
	static int[] parent = new int[10];
	
	static int getParent(int x) {
		if(x==parent[x]) return x;
		return parent[x] = getParent(parent[x]);
	}
	
	static void union(int x, int y) {
		x = getParent(x);
		y = getParent(y);
		if(x>y) parent[x] = y;
		else parent[y] = x;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		for(int i=0;i<10;i++) parent[i] = i;
		
		union(0,1);
		union(1,2);
		union(2,3);
		union(4,5);
		union(5,6);
		union(6,7);
		union(8,9);
		//{0,1,2,3},{4,5,6,7},{8,9}
		
		for(int i=0;i<10;i++) System.out.print(parent[i]);
	}

}
