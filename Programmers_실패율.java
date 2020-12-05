package test;

import java.util.*;

public class test {	
	public static void main(String[] args) {
		int n = 8;//스ㅡ테이지 주어짐
//		int [] stages = {1,2,3,4,5,6,7};//사용자 위치 주어짐
//		int n=5;
		int [] stages = {2,1,2,6,2,4,3,3};
		HashMap<Integer,Double> map = new HashMap<>(n);
		int [] answer = new int [n];
		int num = stages.length;//분모 
		for(int i=1;i<=n;i++) {
			int count = 0;
			for(int j=0;j<stages.length;j++) {
				if(stages[j]>=i&&stages[j]==i) count++;
			}
			if(num<=0) map.put(i, 0.0);
			else map.put(i, (double)count/num);
			num = num - count;
		}
		System.out.println(map);
		List<Integer> sort = new ArrayList<>(map.keySet());
		
		Collections.sort(sort, (o1, o2) -> (map.get(o2).compareTo(map.get(o1))));
		System.out.println(sort);
		int size =0;
		for(int i : sort) answer[size++] = i;
		for(int i=0;i<n;i++) System.out.print(answer[i]);
	}

	
}
