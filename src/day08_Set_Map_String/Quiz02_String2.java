package day08_Set_Map_String;

import java.util.ArrayList;

public class Quiz02_String2 {
	public static void main(String[] args) {
		// 2�� ����
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
		
		System.out.println("�� ���� : " +str.length());
		System.out.println("a ���� : "+ arr1.size());
		System.out.println("g ���� : "+ arr2.size());
		
	}

}
