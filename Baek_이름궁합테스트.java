package test;

import java.io.*;
import java.util.*;

public class test {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] alphabet = {3,2,1,2,4,3,1,3,1,1,3,1,3,2,1,2,2,2,1,2,1,1,1,2,2,1};

		int len1 = Integer.parseInt(st.nextToken());
		int len2 = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		char[] str = st.nextToken().toCharArray();
		char[] str2 = st.nextToken().toCharArray();

		ArrayList<Integer> answer = new ArrayList<Integer>();
		
		for(int i=0;i<Math.min(len1, len2);i++) {
			answer.add(alphabet[str[i]-'A']);
			answer.add(alphabet[str2[i]-'A']);
		}
		
		for(int i=Math.min(len1, len2);i<Math.max(len1, len2);i++) {
			if(len1>len2) {//str
				answer.add(alphabet[str[i]-'A']);
			}
			else {//str2
				answer.add(alphabet[str2[i]-'A']);
			}
		}
		
		while(answer.size()!=2) {
			for(int i=0;i<answer.size()-1;i++) {
				int temp = answer.get(i)+answer.get(i+1);
				if(temp>=10) temp = temp % (10 *(temp/10));
				answer.set(i, temp);
			}
			answer.remove(answer.size()-1);
		}
		
	
		if(answer.get(0)!=0) System.out.print(answer.get(0));
		System.out.print(answer.get(1)+"%");

	}


}




