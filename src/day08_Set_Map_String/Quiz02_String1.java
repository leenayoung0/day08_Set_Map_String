package day08_Set_Map_String;

import java.util.ArrayList;

public class Quiz02_String1 {
	public static void main(String[] args) {
		// 1�� ���� ���ڿ����� a�� ��ġ�� ����
		// ��� : [1,5,13,17,21,29,33,37,45]
		String str = "Have a nice day Have a nice day Have a nice day";
		ArrayList arr = new ArrayList();
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)=='a') {
				arr.add(i);	
			}
		}
		System.out.println("��� : "+ arr);
	}

}
