package Data_Structure;

import java.util.*;

public class hash {
	/*
	 * hashTable vs hashMap
	 * ����ȭ o       ����ȭ x
	 * null x       null o
	 * ��Ƽ������              ���Ͻ�����
	 * 
	 * hashMap vs treeMap
	 * ���� x       key������ ����
	 * 
	 * hashMap vs hastSet
	 * �Ѵ� ����ȭ x
	 * set        map �������̽�
	 * �ߺ� �� ���       �ߺ� x
	 *            ���� null�� ���
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		ht.put(0, "¯��");
		ht.put(3, "���");
		ht.put(2, "ö��");
		ht.put(1, "¯��");
		ht.put(4, "����");
		ht.put(4, "����");//�ߺ��� �ȵǱ� ������ ���̷� ���� 
		//hashTable - put data

		hm.put(0, "¯��");
		hm.put(3, "���");
		hm.put(2, "ö��");
		hm.put(1, "¯��");
		hm.put(4, "����");
		hm.put(4, "����");//�ߺ��� �ȵǱ� ������ ���̷� ���� 
		//hashMap - put data

		ht.replace(1, "�ͱ�");//�� �ٲٱ�
		//		ht.remove(4);

		System.out.println(ht);
		System.out.println("hastTable key Ȯ�� : "+ht.containsKey(2));
		System.out.println("hastTable value Ȯ��  : "+ht.containsValue("���"));
		System.out.println("hastTable ��ü key Ȯ�� : "+ht.keySet());
		System.out.println(ht.get(0));

		System.out.println();
		
		Iterator iterator = hm.entrySet().iterator(); // -- ��� 2
		while (iterator.hasNext()) {
		    Map.Entry me2 = (Map.Entry) iterator.next();
		    System.out.println("Key: "+me2.getKey() + " & Value: " + me2.getValue());
		}


		for (Map.Entry me : hm.entrySet()) { // -- ��� 1
			System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
		}
		
		map.put("���", 123);
		map.put("���", 456);
		map.put("�ٴ�", 78);
		map.put("����", 9);
		
		System.out.println();
		System.out.println(map);
		//Ʈ���� ����ؼ� ����
		Map<String,Integer> tm = new TreeMap<>(map);
		System.out.println(tm);
//		map = new HashMap<>(tm);
//		System.out.println(map);
		
		//hastSet
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(5);
		hs.add(2);
		hs.add(1);//�ߺ�x
		System.out.println(hs);
		System.out.println("hashSet �� �˻� : "+hs.contains(2));
		
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(2);
		list.add(3);
		
		//hastSet����ؼ� �ߺ����� 
		HashSet<Integer> h = new HashSet<Integer>(list);
		list = new ArrayList<>(h);
		System.out.println(list);

	}

}
