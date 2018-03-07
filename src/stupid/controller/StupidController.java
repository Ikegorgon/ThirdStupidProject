package stupid.controller;

import java.util.List;
import java.util.ArrayList;

public class StupidController {
	private ArrayList<String> myWords;
	private String[] words;
	private int[] num;
	
	public void start() {
		System.out.println("Hi there");
		
		//array testing
//		myWords = new ArrayList();
//		myWords[4] = 2;
		words = new String[5];
		words[2] = "Hello";
		words[4] = "1234567890";
		num = new int[39];
		num[4] = 23;
		System.out.println(myWords);
		System.out.println(words);
		System.out.println(num);
		
		for (String current : words) {
			System.out.println(current);
		}
		for (int i = 0; i < num.length; i += 1) {
			num[i] = i + 1;
			System.out.println(num[i]);
		}
	}
}
