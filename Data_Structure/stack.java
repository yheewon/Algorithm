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
		System.out.println(st.peek());//��ȯ��
		System.out.println(st);
		
		//��ü�� �����ϴ� ��ġ �ε��� ���, ���� ���������� ����� ����� ��ġ���� 1���� ����
		System.out.println(st.search(5));//1
		

	}

}
