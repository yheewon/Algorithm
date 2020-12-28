package Data_Structure;

import java.util.*;

public class arrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList list = new ArrayList();
		ArrayList<Integer> num = new ArrayList<Integer>(10);//�ʱ�뷮 ����
		ArrayList<Integer> num2 = new ArrayList<Integer>(Arrays.asList(1,2,3));//������ �� �߰�
		
		list.add("yun");
		list.add(null);
		num2.add(3,4);//�ε��� 3�� 4 �߰�
		list.set(0, "heewon");//����
		System.out.println(list);
		System.out.println(num2);
		
		list.remove(1);//����
		System.out.println(list);
		list.clear();//��� �� ����
		System.out.println(list);
		
		list.add("yun");
		list.add("hee");
		list.add("won");
		
		list.set(0, "yoon");
		System.out.println(list);
		
		System.out.println(num2.get(2));//�� �ϳ� ���
		
		System.out.println(num2.contains(2));//true
		System.out.println(num2.indexOf(2));//2�� �ִ� �ε��� ��ȯ ������ -1
		
		System.out.println(Collections.max(num2));//�ִ�
		System.out.println(Collections.min(num2));//�ּڰ�

		Collections.sort(list);//�������� ����
		System.out.println("��������" + list);
		
		//�������� ����
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
