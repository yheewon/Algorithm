package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

class Node{
	public int age;
	public String name;
	
	public Node(int age,String name) {
		this.age =age;
		this.name = name;
	}
	
}

public class test {
	
	
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		ArrayList<Node> answer = new ArrayList<Node>();
		
		for(int i=0;i<N;i++) {
			int age = sc.nextInt();
			String name = sc.next();
			
			answer.add(new Node(age,name));
		}
		
		Collections.sort(answer,new Comparator<Node>() {

			@Override
			public int compare(Node o1, Node o2) {
				// TODO Auto-generated method stub
				return Integer.compare(o1.age, o2.age);
			}
			
		});
		
		for(Node node : answer) {
			System.out.println(node.age+" "+node.name);
		}
		
	}

}





