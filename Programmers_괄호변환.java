package test;

import java.util.*;

public class test {	
	public static String test(String answer, String s,int size) {
		int count = 0;
		for(int i=0;i<s.length();i++) {
			if(answer.length()==size) break;
			System.out.println("------------"+s+"-----문자열-----"+i+"번째-------------"+answer);
			count = (s.charAt(i)=='(') ? count+1 : count-1;
			if(count == 0) {//균형잡인 괄호 문자열 
				String u = s.substring(0,i+1);
				String v = s.substring(i+1);
				System.out.println("문자열 U, V : "+u+" // "+v);
				if(u.charAt(0)=='(') {
					answer += u;
					System.out.println("if : " + answer);
					if(v.length()!=0) answer = test(answer,v,size);
					return answer;
				}
				else if(u.charAt(0)==')'){//올바른 괄호 문자열이 아님 
					answer += "(";
					System.out.println("else (추가: " + answer);
					answer = test(answer,v,size);
					answer +=")";
					System.out.println("else: )추가 " + answer);
					String change = "";
					for(int j=1;j<u.length()-1;j++) {
						if(u.charAt(j)=='(') change +=")";
						else change += "(";
					}
					answer += change;
					System.out.println("for문안최종 : " + answer);
					return answer;
				}
			}
		}
		return answer;
	

	}
	public static void main(String[] args) {
		String s = "(()())()";
		String answer = "";
		answer = test(answer,s,s.length());

		System.out.println("최종 : " + answer);
	}

	
}
