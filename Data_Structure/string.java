package Data_Structure;

import java.util.*;

public class string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "heewon";
		String b = new String("hello i am heewon");
		
		// String to int
		String num = "0629";
		System.out.println(Integer.parseInt(num));
		
		//int to String
		int num2 = 1152;
		System.out.println(Integer.toString(num2));
		
		//문자열 비교 char 형은 ==로 비교
		System.out.println(a.equals(b));//false
		
		//특정 문자 시작 인덱스 리턴_indexOf 존재하지 않으면 -1반환
		System.out.println(a.indexOf("won"));//3
		
		//특정 문자 마지막 몇번째 위치_lastindexof
		System.out.println(a.lastIndexOf('w'));//3
		
		//특정 문자 바꾸기_replaceAll => 기존 문자열 자체가 바뀌지는 않음 
		//+replace , replaceFirst
		System.out.println(a.replaceAll("e", "a"));
//		String replace_str = a.replaceAll("won", "hee");
//		System.out.println(a);
		
		//특정 부분 뽑아내기 시작위치<= 문자열 < 끝위치
		String sub_str = a.substring(0,3);
		System.out.println(sub_str);
		
		//대문자 변경 & 소문자 변경
		String up = a.toUpperCase();
		String down = up.toLowerCase();
		System.out.println(up+"//"+down);
		
		//문자열 시작 확인 & 끝 확인
		System.out.println(a.startsWith("h"));//true
		System.out.println(a.startsWith("w"));//false
		System.out.println(a.endsWith("n"));//true
		
		//문자열 자르기
		String[] split = a.split("");
//		for(int i=0;i<a.length();i++) System.out.println(split[i]);
		for(String s:split) System.out.println(s);
		
		//문자열 포함
		System.out.println(b.contains("hello"));//true
		
		//지정한 인덱스 문자 반환 =>char형
		System.out.println(b.charAt(4));
		
		//문자열 결합
		System.out.println(a.concat(b));
		
		//문자열 배열 저장 =>char형
		char[] c_arr = b.toCharArray();
		for(int i=0;i<c_arr.length;i++)System.out.println(c_arr[i]);
		
		

	}

}
