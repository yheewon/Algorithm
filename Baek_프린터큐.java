package test;

import java.util.*;

public class test {	
	static Scanner sc = new Scanner(System.in);
	
	static void input() {
		int n = sc.nextInt();//문서 수
		int m = sc.nextInt();//현재 point
		ArrayList<Integer> priority = new ArrayList<Integer>();
		
		
		for(int i=0;i<n;i++) {
			int scan = sc.nextInt();
			priority.add(scan);
		}
		
		run(n,m,priority);
	}
	
	static void run(int n,int point, ArrayList priority) {
		int remove = 0;
		
		while(priority.size()!=0) {
			int list_max = (int) Collections.max(priority);//리스트 안 최댓값
			
			if(priority.get(0).equals(list_max)) {//최고 우선순위와 첫번째 값이 같음 => 현재 인덱스 값이 가장 큰 우선순위
				priority.remove(0);
				System.out.println("증가!!!!!!!");
				remove++;
				if(point!=0) point--;
				else if(point == 0) break;
			}
			else {
				priority.add(priority.get(0));
				priority.remove(0);
				if(point != 0) point--;
				else if(point ==0) point = priority.size()-1;
			}
			
			for(int i=0;i<priority.size();i++) System.out.print(priority.get(i));
			System.out.println("----------"+point);	
		}
		
		System.out.println(remove);
	}

	public static void main(String[] args) throws Exception {
		int test_case = sc.nextInt();// tc수
		
		for(int i=0;i<test_case;i++) {
			input();
		}
		
	}
}

