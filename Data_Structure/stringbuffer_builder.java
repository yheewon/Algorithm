package Data_Structure;

import java.util.*;
import java.io.*;

public class stringbuffer_builder {
	/*
	String str = "hello";
	str = str + "world";
	str�� world�� �߰��Ȱ��� �ƴ϶� hello world��� ���ο� �޸� ������ ����Ŵ
	ó�� hello�� garbage�� �����ִٰ� garbage collection�� ���� �����
	���ڿ� �߰�, ����, ������ ���� �Ͼ�� ���� ����  => StringBuffer/StringBuilder���
	
	StringBuffer vs StringBuilder => ����ȭ ���� 
	buffer : ����ȭ ���� - ��Ƽ������ ȯ�濡�� ����(string����)
	builder : ����ȭ ���� x - ���Ͼ����忡�� ������ buffer���� �پ
	*/
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//StringBuffer
		String s = "heewon";
		StringBuffer sb = new StringBuffer(s);
		
		System.out.println(sb);//ó�� ����
		System.out.println(sb.toString());//���ڿ� ����
		System.out.println(sb.substring(0,2));//he
		System.out.println(sb.insert(0, "yun "));//���� sb ����
		System.out.println(sb.delete(0, 4));//����
		System.out.println(sb.append(" hello"));//���̱�
		System.out.println(sb.reverse());//���ڿ� ������
		System.out.println(sb.replace(0, 1, "s"));
		
		//StringBuilder - buffer�� �Լ� �Ȱ��� 
		StringBuilder str_b = new StringBuilder(s);
		

	}

}
