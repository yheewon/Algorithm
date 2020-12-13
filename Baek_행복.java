package test;

import java.io.*;
import java.util.*;

public class test {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int num = sc.nextInt();
		ArrayList<Integer> list = new ArrayList<Integer>();

		for(int i=0;i<num;i++) {
			list.add(sc.nextInt());
		}

		Collections.sort(list);
		System.out.println(list.get(list.size()-1)-list.get(0));


	}

}


