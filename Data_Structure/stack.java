package Data_Structure;

import java.util.*;

public class stack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//stack
		Stack<Integer> st = new Stack<Integer>();
		
		System.out.println(st.isEmpty());
		st.push(1);
		st.push(1);
		st.push(5);
		st.push(2);//1152
		
		System.out.println(st.pop());
		System.out.println(st);
		System.out.println(st.peek());//반환만
		System.out.println(st);
		
		//객체가 존재하는 위치 인덱스 출력, 제일 마지막으로 저장된 요소의 위치부터 1부터 시작
		System.out.println(st.search(5));//1
		

	}

}
