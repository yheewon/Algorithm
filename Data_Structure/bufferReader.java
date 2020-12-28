package Data_Structure;

import java.io.*;
import java.util.*;

public class bufferReader {
	/*
	scanner vs bufferedReader
	scanner : space enter를 모두 경계로 인식
	bufferedreader : enter만 경계로 인식, 받은 데이터 string으로 고정, 많은 양의 데이터를 입력받을 경우 효율적
	->알고리즘 효율성 검사에 유리, 예외처리 필요
	*/

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s = bf.readLine();
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(s);
		bw.flush();//남아있는 데이터 모두 출력
		bw.close();//스트림 닫음
		//writer => 자동개행이 없음

	}

}
