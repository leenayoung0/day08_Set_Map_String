package day08_Set_Map_String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex05_Map {
	public static void main(String[] args) {
		/*
		 * ArrayList<String> arr = new ArrayList<String>(); 
		 * arr.add("aaa");
		 * arr.add(111); ���ڿ��� �ƴ϶� ���� �߰� ��
		 */
		Scanner input = new Scanner(System.in);
		HashMap map = new HashMap(); //<> ���׸� : Ÿ�� ����(�ο�)
		String key = null, value=null;
		System.out.println("������ Ű �Է�");
		key = input.next();
		System.out.println("������ �� �Է�");
		value = input.next();
		
		map.put(key, value);
		
		System.out.println(map);
	}

}
