package test;

import java.io.*;
import java.util.*;

public class test {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws IOException {
		int num = sc.nextInt();
		String answer = "";
		int sum = 0;
		
		for(int i=1;i<=num;i++) {
			int scan = sc.nextInt();
			if(i==1) {
				answer = Integer.toString(scan);
				sum = scan;
			}
			else {
				answer += " "+ Integer.toString(scan*i-sum);
				sum += scan*i-sum;
			}
		}

		System.out.println(answer);
			
	}

}


