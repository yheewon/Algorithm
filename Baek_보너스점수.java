package test;

import java.io.*;
import java.util.*;

public class test {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
	
		int N = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		char[] str = st.nextToken().toCharArray();

		int answer = 0;
		int bonus = 0;
		
		for(int i=0;i<N;i++) {
			if(str[i]=='O') {
				answer += i + 1 + bonus;
				bonus++;
			}
			else bonus = 0;
		}
		System.out.println(answer);

	}


}




