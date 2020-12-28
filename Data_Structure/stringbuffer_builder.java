package Data_Structure;

import java.util.*;
import java.io.*;

public class stringbuffer_builder {
	/*
	String str = "hello";
	str = str + "world";
	str에 world가 추가된것이 아니라 hello world라는 새로운 메모리 영역을 가리킴
	처음 hello는 garbage로 남아있다가 garbage collection에 의해 사라짐
	문자열 추가, 수정, 삭제가 자주 일어나면 성능 저하  => StringBuffer/StringBuilder사용
	
	StringBuffer vs StringBuilder => 동기화 유무 
	buffer : 동기화 지원 - 멀티쓰레드 환경에서 안전(string도임)
	builder : 동기화 지원 x - 단일쓰레드에서 성능이 buffer보다 뛰어남
	*/
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringBuffer
		String s = "heewon";
		StringBuffer sb = new StringBuffer(s);
		
		System.out.println(sb);//처음 상태
		System.out.println(sb.toString());//문자열 변경
		System.out.println(sb.substring(0,2));//he
		System.out.println(sb.insert(0, "yun "));//기존 sb 변경
		System.out.println(sb.delete(0, 4));//삭제
		System.out.println(sb.append(" hello"));//붙이기
		System.out.println(sb.reverse());//문자열 뒤집기
		System.out.println(sb.replace(0, 1, "s"));
		
		//StringBuilder - buffer와 함수 똑같음 
		StringBuilder str_b = new StringBuilder(s);
		

	}

}
