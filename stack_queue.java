package Data_Structure;

import java.util.*;

public class stack_queue {

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
		System.out.println(st.peek());
		System.out.println(st);
		
		//객체가 존재하는 위치 인덱스 출력, 제일 마지막으로 저장된 요소의 위치부터 1부터 시작
		System.out.println(st.search(5));//1
		
		//queue
		Queue<String> qu = new LinkedList<>();
		//add = offer add는 삽입에 성공 true반한, 실패 illegalexception발생
		qu.offer("yun");
		qu.offer("hee");
		qu.offer("won");
		
		System.out.println(qu);
		//peek = element 맨 앞에 잇는 요소 반환하는 건 똑같지만, peek은 큐가 비어있을 때 null반환
		System.out.println(qu.peek());
		System.out.println(qu.poll());
		System.out.println(qu);
		
		//큐의 맨 앞에 있는 요소 제거
		qu.remove()

	}

}
