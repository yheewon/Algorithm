import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class test {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int test_case = Integer.parseInt(br.readLine());
		
		for(int k=0;k<test_case;k++) {
			String s = br.readLine();
			
			Stack<Character> left = new Stack<Character>();
			Stack<Character> right = new Stack<Character>();
			
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '-') {
					if (!left.empty()) left.pop();
				}
				else if (s.charAt(i) == '<') {
					if (!left.empty()) {
						right.push(left.pop());
					}
				}
				else if (s.charAt(i) == '>') {
					if (!right.empty()) {
						left.push(right.pop());
					}
				}
				else {
					left.push(s.charAt(i));
				}
			}
			
			StringBuilder result = new StringBuilder();
			while (!right.empty()) {
				left.push(right.pop());
			}
			while (!left.empty()) {
				result.append(left.pop());
			}
			System.out.println(result.reverse().toString());
		}
	}

}
