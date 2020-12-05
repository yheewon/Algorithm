package test;

import java.util.*;

public class test {	
	public static void main(String[] args) {
		int[][] board = {{0,0,0,0,0},{0,0,1,0,3},{0,2,5,0,1},{4,2,4,4,2},{3,5,1,3,1}};//인형뽐기 기계
		int [] moves = {1,5,3,5,1,2,1,4};
		int answer = 0;
		Stack<Integer> stack = new Stack<>();
		
		for(int i=0;i<moves.length;i++) {
			int x = moves[i]-1;
			for(int j=0;j<board.length;j++) {
				if(board[j][x]!=0) {
					if(!stack.isEmpty() && stack.peek()==board[j][x]) {//바구니속 연속되는 인형 검사
						answer++;
						stack.pop();
					}
					else stack.push(board[j][x]);
					board[j][x] =0;
					break;
				}
			}
		}
//		for(int i=0;i<=b_top;i++) System.out.print(basket[i]);
		System.out.print(answer*2);
	}
	
}
