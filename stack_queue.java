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
		
		//��ü�� �����ϴ� ��ġ �ε��� ���, ���� ���������� ����� ����� ��ġ���� 1���� ����
		System.out.println(st.search(5));//1
		
		//queue
		Queue<String> qu = new LinkedList<>();
		//add = offer add�� ���Կ� ���� true����, ���� illegalexception�߻�
		qu.offer("yun");
		qu.offer("hee");
		qu.offer("won");
		
		System.out.println(qu);
		//peek = element �� �տ� �մ� ��� ��ȯ�ϴ� �� �Ȱ�����, peek�� ť�� ������� �� null��ȯ
		System.out.println(qu.peek());
		System.out.println(qu.poll());
		System.out.println(qu);
		
		//ť�� �� �տ� �ִ� ��� ����
		qu.remove()

	}

}
