package test;

import java.util.*;

public class test {	
	public static void turn(int[][] key) {//열쇠 회전
		int [][] temp = new int [key.length][key.length];//회전한 열쇠
		System.out.println(key.length);
		int a = key.length-1;
		for(int i=0;i<key.length;i++) {
			for(int j=0;j<key.length;j++) {
				temp[j][a] = key[i][j];
			}
			a = a-1;
		}
		for(int i=0;i<key.length;i++) {
			for(int j=0;j<key.length;j++) {
				System.out.print(temp[i][j]);
			}
			System.out.println();
		}
	}
	
	public static void move(int[][] lock, int size) {//열쇠 움직이기
		int[][] map = new int[lock.length*size][lock.length*size];//키*자물쇠 배열 만들기
		
		
	}
	public static void main(String[] args) {
		int [][] key = {{0,0,0},{1,0,0},{0,1,1}};
		int [][] lock = {{1,1,1},{1,1,0},{1,0,1}};
		boolean answer = true;
		int count = 0;
		
		for(int i=0;i<lock.length;i++) {
			for(int j=0;j<lock.length;j++) {
				if(lock[i][j]==0) count++ ;//자물쇠안에 빈공간 개수 찾기 
			}
		}
		
		turn(key);
		
	}

	
}
