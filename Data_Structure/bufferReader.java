package Data_Structure;

import java.io.*;
import java.util.*;

public class bufferReader {
	/*
	scanner vs bufferedReader
	scanner : space enter�� ��� ���� �ν�
	bufferedreader : enter�� ���� �ν�, ���� ������ string���� ����, ���� ���� �����͸� �Է¹��� ��� ȿ����
	->�˰��� ȿ���� �˻翡 ����, ����ó�� �ʿ�
	*/

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(s);
		bw.flush();//�����ִ� ������ ��� ���
		bw.close();//��Ʈ�� ����
		//writer => �ڵ������� ����

	}

}
