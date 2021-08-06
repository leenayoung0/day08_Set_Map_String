package day08_Set_Map_String;

import java.util.ArrayList;

public class Quiz02_String2 {
	public static void main(String[] args) {
		// 2번 문제
		String str = "It is a fun java programming";
		ArrayList arr1 = new ArrayList();
		ArrayList arr2 = new ArrayList();
		for(int i=0; i< str.length(); i++) {
			if(str.charAt(i)=='a') {
				arr1.add(i);
			}
			if(str.charAt(i)=='g') {
				arr2.add(i);
			}
		}
		
		System.out.println("총 개수 : " +str.length());
		System.out.println("a 개수 : "+ arr1.size());
		System.out.println("g 개수 : "+ arr2.size());
		
	}

}
