package com.exam;

import java.util.HashMap;
import java.util.Scanner;

public class pg416 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> dic=new HashMap<String, String>();
		
		dic.put("babe", "baby");
		dic.put("love", "bae");
		dic.put("Mac", "apple");
		
		Scanner scanner=new Scanner(System.in);
		while(true) {
			System.out.println("what do you want to find?");
			String eng=scanner.next();
			if(eng.equals("exit")){
				System.out.println("end");
				break;
			}
			String kor=dic.get(eng);
			if(kor==null)
				System.out.println(eng+" not founded");
			else
				System.out.println(kor);
		}
		scanner.close();
	}

}
