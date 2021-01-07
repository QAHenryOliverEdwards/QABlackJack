package com.qa.main;

public class Runner {
	
	public static void main(String[] args) {
	
		Play hand1 = new Play(10, 21);
		System.out.println(hand1.playCompare());
		Play hand2 = new Play(20, 18);
		System.out.println(hand2.playCompare());
		Play hand3 = new Play(1, 22);
		System.out.println(hand3.playCompare());
		Play hand4 = new Play(22, 23);
		System.out.println(hand4.playCompare());
	}

}
