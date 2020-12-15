package test;


import java.util.*;


public class test {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) throws Exception {
		HashSet<Integer> hsN = new HashSet<>();
		ArrayList<Integer> listM = new ArrayList<>();
		
		int N  = sc.nextInt();
		for(int i=0;i<N;i++) hsN.add(sc.nextInt());
		
		int M = sc.nextInt();
		for(int i=0;i<M;i++) listM.add(sc.nextInt());
		
		for(int i=0;i<M;i++) {
			if(hsN.contains(listM.get(i))) System.out.println("1");
			else System.out.println("0");
		}
		
		
	}


}




