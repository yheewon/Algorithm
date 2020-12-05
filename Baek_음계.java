import java.util.*;
public class Main {	
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
        int first = 0;
		int a=0;
		int d =0;
		
		for (int i = 0; i < 8; i++) {
			arr[i] = sc.nextInt();
		}
		for(int i=0;i<arr.length;i++) {
			first = arr[0];
			if(first+i == arr[i]) a++;
			if(first-i == arr[i]) d++;
		}
	
		if(a==8) System.out.println("ascending");
		else if(d==8) System.out.println("descending");
		else System.out.println("mixed");
		
	}

	
}
