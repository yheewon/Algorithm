class Solution {
    public static String[] divide(int num, String s) {
		String str = "";
		for(int i=1;i<=s.length();i++) {
			str += s.charAt(i-1);
			if(i%num==0) str += "/";
		}
		String [] arr = str.split("/");
		
		return arr;
	
	}
	
	public static int compression(String arr[]) {
		int count = 1;
		String result = "";
		for(int j=0;j<arr.length-1;j++) {
			if(arr[j].equals(arr[j+1])) count++;
			else{
				if(count>1) result += count;
				result += arr[j];
				count=1;
			}
			if(j == arr.length-2) {
				if(count>1) result += count;
				result += arr[j+1];
			}
		}
		return result.length();
	}
    public int solution(String s) {
        int answer = s.length();
		
		for(int i=1;i<=s.length()/2;i++) {
			String arr[] = divide(i,s);
			int size = compression(arr);
			if(answer>size) answer = size;
		
		}
        return answer;
    }
}
