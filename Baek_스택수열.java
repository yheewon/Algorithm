import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Stack <Integer> st = new Stack<Integer>();
		ArrayList<Character> answer = new ArrayList<Character>();

		int count = 1;
		for(int i=1;i<=n;i++) {
			int num = sc.nextInt();

			while(count <= num) {
				st.push(count);
				count++;
				answer.add('+');
			}

			if(st.peek() == num) {
				st.pop();
				answer.add('-');
			}
			else {
				System.out.println("NO");
				return;
			}
		}
		
		// 결과를 차례대로 출력 
		for(int i=0;i<answer.size();i++) System.out.println(answer.get(i));
	}

}
