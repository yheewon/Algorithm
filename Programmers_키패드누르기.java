package test;

import java.util.*;

public class test {	
	static int [] rHand = {3,0};
	static int [] lHand = {3,2};
	static String answer = "";
	
	public static void input(int x,int y,int hand) {
		if(hand==0) {//R
			answer += "R";
			rHand[0]=x;rHand[1]=y;
		}
		else {
			answer += "L";
			lHand[0]=x;lHand[1]=y;
		}
	}
	
	
	public static void main(String[] args) {
		int numbers[] = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
		String hand = "right";
		
		for(int i =0;i<numbers.length;i++) {
			if(numbers[i]==1) input(0,0,1);
			else if(numbers[i]==3) input(0,2,0);
			else if(numbers[i]==4) input(1,0,1);
			else if(numbers[i]==6) input(1,2,0);
			else if(numbers[i]==7) input(2,0,1);
			else if(numbers[i]==9) input(2,2,0);
			else {
				int x=0;
				int hand_num=0;
				double rdis=0;
				double ldis=0;
				
				if(numbers[i]==5) x=1;
				else if(numbers[i]==8) x=2;
				else if(numbers[i]==0) x=3;
//				rdis = Math.sqrt(Math.pow(Math.abs(rHand[0]-x), 2) + Math.pow(Math.abs(rHand[1]-1), 2));
//				ldis = Math.sqrt(Math.pow(Math.abs(lHand[0]-x), 2) + Math.pow(Math.abs(lHand[1]-1), 2));
				rdis = Math.abs(rHand[0]-x) + Math.abs(rHand[1]-1);
				ldis = Math.abs(lHand[0]-x) + Math.abs(lHand[1]-1);
				
				if(rdis>ldis) hand_num =1;
				else if(rdis<ldis) hand_num =0;
				else {
					if(hand.equals("right")) hand_num =0;
				}
				input(x,1,hand_num);
			}
		}
		System.out.println(answer);
		
	}
	
}
