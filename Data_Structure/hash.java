package Data_Structure;

import java.util.*;

public class hash {
	/*
	 * hashTable vs hashMap
	 * 동기화 o       동기화 x
	 * null x       null o
	 * 멀티스레드              단일스레드
	 * 
	 * hashMap vs treeMap
	 * 정렬 x       key순으로 정렬
	 * 
	 * hashMap vs hastSet
	 * 둘다 동기화 x
	 * set        map 인터페이스
	 * 중복 값 허용       중복 x
	 *            단일 null값 허용
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Integer,String> ht = new Hashtable<Integer,String>();
		HashMap<Integer,String> hm = new HashMap<Integer,String>();
		HashMap<String,Integer> map = new HashMap<String,Integer>();
		
		ht.put(0, "짱구");
		ht.put(3, "희원");
		ht.put(2, "철수");
		ht.put(1, "짱아");
		ht.put(4, "유리");
		ht.put(4, "훈이");//중복이 안되기 때문에 훈이로 저장 
		//hashTable - put data

		hm.put(0, "짱구");
		hm.put(3, "희원");
		hm.put(2, "철수");
		hm.put(1, "짱아");
		hm.put(4, "유리");
		hm.put(4, "훈이");//중복이 안되기 때문에 훈이로 저장 
		//hashMap - put data

		ht.replace(1, "맹구");//값 바꾸기
		//		ht.remove(4);

		System.out.println(ht);
		System.out.println("hastTable key 확인 : "+ht.containsKey(2));
		System.out.println("hastTable value 확인  : "+ht.containsValue("희원"));
		System.out.println("hastTable 전체 key 확인 : "+ht.keySet());
		System.out.println(ht.get(0));

		System.out.println();
		
		Iterator iterator = hm.entrySet().iterator(); // -- 방법 2
		while (iterator.hasNext()) {
		    Map.Entry me2 = (Map.Entry) iterator.next();
		    System.out.println("Key: "+me2.getKey() + " & Value: " + me2.getValue());
		}


		for (Map.Entry me : hm.entrySet()) { // -- 방법 1
			System.out.println("Key: "+me.getKey() + " & Value: " + me.getValue());
		}
		
		map.put("희원", 123);
		map.put("기기", 456);
		map.put("다다", 78);
		map.put("나나", 9);
		
		System.out.println();
		System.out.println(map);
		//트리맵 사용해서 정렬
		Map<String,Integer> tm = new TreeMap<>(map);
		System.out.println(tm);
//		map = new HashMap<>(tm);
//		System.out.println(map);
		
		//hastSet
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add(1);
		hs.add(5);
		hs.add(2);
		hs.add(1);//중복x
		System.out.println(hs);
		System.out.println("hashSet 값 검색 : "+hs.contains(2));
		
		List<Integer> list = new ArrayList<>();
		list.add(2);
		list.add(4);
		list.add(2);
		list.add(3);
		
		//hastSet사용해서 중복제거 
		HashSet<Integer> h = new HashSet<Integer>(list);
		list = new ArrayList<>(h);
		System.out.println(list);

	}

}
