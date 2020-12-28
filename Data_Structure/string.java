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
		
		//���ڿ� �� char ���� ==�� ��
		System.out.println(a.equals(b));//false
		
		//Ư�� ���� ���� �ε��� ����_indexOf �������� ������ -1��ȯ
		System.out.println(a.indexOf("won"));//3
		
		//Ư�� ���� ������ ���° ��ġ_lastindexof
		System.out.println(a.lastIndexOf('w'));//3
		
		//Ư�� ���� �ٲٱ�_replaceAll => ���� ���ڿ� ��ü�� �ٲ����� ���� 
		//+replace , replaceFirst
		System.out.println(a.replaceAll("e", "a"));
//		String replace_str = a.replaceAll("won", "hee");
//		System.out.println(a);
		
		//Ư�� �κ� �̾Ƴ��� ������ġ<= ���ڿ� < ����ġ
		String sub_str = a.substring(0,3);
		System.out.println(sub_str);
		
		//�빮�� ���� & �ҹ��� ����
		String up = a.toUpperCase();
		String down = up.toLowerCase();
		System.out.println(up+"//"+down);
		
		//���ڿ� ���� Ȯ�� & �� Ȯ��
		System.out.println(a.startsWith("h"));//true
		System.out.println(a.startsWith("w"));//false
		System.out.println(a.endsWith("n"));//true
		
		//���ڿ� �ڸ���
		String[] split = a.split("");
//		for(int i=0;i<a.length();i++) System.out.println(split[i]);
		for(String s:split) System.out.println(s);
		
		//���ڿ� ����
		System.out.println(b.contains("hello"));//true
		
		//������ �ε��� ���� ��ȯ =>char��
		System.out.println(b.charAt(4));
		
		//���ڿ� ����
		System.out.println(a.concat(b));
		
		//���ڿ� �迭 ���� =>char��
		char[] c_arr = b.toCharArray();
		for(int i=0;i<c_arr.length;i++)System.out.println(c_arr[i]);
		
		

	}

}
