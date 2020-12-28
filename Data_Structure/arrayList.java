package Data_Structure;

import java.util.*;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		ArrayList<Integer> num = new ArrayList<Integer>(10);//초기용량 지정
		ArrayList<Integer> num2 = new ArrayList<Integer>(Arrays.asList(1,2,3));//생성시 값 추가
		
		list.add("yun");
		list.add(null);
		num2.add(3,4);//인덱스 3뒤 4 추가
		list.set(0, "heewon");//수정
		System.out.println(list);
		System.out.println(num2);
		
		list.remove(1);//삭제
		System.out.println(list);
		list.clear();//모든 값 제거
		System.out.println(list);
		
		list.add("yun");
		list.add("hee");
		list.add("won");
		
		list.set(0, "yoon");
		System.out.println(list);
		
		System.out.println(num2.get(2));//값 하나 출력
		
		System.out.println(num2.contains(2));//true
		System.out.println(num2.indexOf(2));//2가 있는 인덱스 반환 없으면 -1
		
		System.out.println(Collections.max(num2));//최댓값
		System.out.println(Collections.min(num2));//최솟값

		Collections.sort(list);//오름차순 정렬
		System.out.println("오름차순" + list);
		
		//내림차순 정렬
		Descending d = new Descending();
		Collections.sort(num2,d);
		System.out.println(num2);

	}

}

class Descending implements Comparator<Integer>{

	@Override
	public int compare(Integer o1, Integer o2) {
		// TODO Auto-generated method stub
		return o2.compareTo(o1);
	}
	
}
