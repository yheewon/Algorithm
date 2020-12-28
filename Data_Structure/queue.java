package Data_Structure;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*
ť : ��Ʈ��ũ���� ���� ���
��Ƽ�½�ŷ�� ���� ���μ��� �����ٸ� ����� �����ϱ� ���� ���� ���
Enqueue : ������ �ֱ�
Dequeue : ������ ����
*/

public class queue {
	public static void main(String[] args) {
		//queue
		Queue<String> qu = new LinkedList<>();
		//add = offer add�� ���Կ� ���� true����, ���� illegalexception�߻�
		qu.add("yun");
		qu.offer("hee");
		qu.offer("won");
		
		System.out.println(qu);
		//peek = element �� �տ� �մ� ��� ��ȯ�ϴ� �� �Ȱ�����, peek�� ť�� ������� �� null��ȯ
		System.out.println(qu.peek());
		System.out.println(qu.poll());//��ȯ �� ����
		System.out.println(qu);
		
		//ť�� �� �տ� �ִ� ��� ����
		qu.remove();
		System.out.println(qu);
		
		//PriorityQueue
		//���� ��Ҵ� ������ �����Ǿ� ����Ʈ�� ���� => �ð����⵵ nlogn
		PriorityQueue<Integer> pq = new PriorityQueue<>();//������� ���� ���� ��
		PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());//������� ���� ���� ��
		
		for(int i=1;i<6;i++) {
			pq.add(i);
			pq2.add(i);
		}//ť�� ���� �߰��ϴ� ���� ��� ����
		
		System.out.println(pq.poll());
		System.out.println(pq2.poll());
	}

}
