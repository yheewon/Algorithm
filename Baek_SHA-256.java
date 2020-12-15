package test;

import java.io.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.*;


public class test {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		StringTokenizer st = new StringTokenizer(br.readLine());
		
		String S = br.readLine();
		
		MessageDigest md = MessageDigest.getInstance("SHA-256");
		byte[] hash = md.digest(S.getBytes("UTF-8"));
		StringBuffer answer = new StringBuffer();
		
		for(int i=0;i<hash.length;i++) {
			String hex = Integer.toHexString(0xff & hash[i]);
			if(hex.length()==1) answer.append('0');
			answer.append(hex);
		}

		System.out.println(answer.toString());
	}


}




