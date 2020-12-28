package Data_Structure;

import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*
큐 : 네트워크에서 많이 사용
멀티태스킹을 위한 프로세스 스케줄링 방식을 구현하기 위해 많이 사용
Enqueue : 데이터 넣기
Dequeue : 데이터 빼기
*/

public class queue {
	public static void main(String[] args) {
		//queue
		Queue<String> qu = new LinkedList<>();
		//add = offer add는 삽입에 성공 true반한, 실패 illegalexception발생
		qu.add("yun");
		qu.offer("hee");
		qu.offer("won");
		
		System.out.println(qu);
		//peek = element 맨 앞에 잇는 요소 반환하는 건 똑같지만, peek은 큐가 비어있을 때 null반환
		System.out.println(qu.peek());
		System.out.println(qu.poll());//반환 후 제거
		System.out.println(qu);
		
		//큐의 맨 앞에 있는 요소 제거
		qu.remove();
		System.out.println(qu);
		
		//PriorityQueue
		//내부 요소는 힙으로 구성되어 이진트리 구조 => 시간복잡도 nlogn
		PriorityQueue<Integer> pq = new PriorityQueue<>();//운선순위가 낮은 숫자 순
		PriorityQueue<Integer> pq2 = new PriorityQueue<>(Collections.reverseOrder());//운선순위가 높은 숫자 순
		
		for(int i=1;i<6;i++) {
			pq.add(i);
			pq2.add(i);
		}//큐에 값을 추가하는 순간 즉시 정렬
		
		System.out.println(pq.poll());
		System.out.println(pq2.poll());
	}

}
