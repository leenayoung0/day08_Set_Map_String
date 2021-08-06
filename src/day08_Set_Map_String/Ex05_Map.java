package day08_Set_Map_String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex05_Map {
	public static void main(String[] args) {
		/*
		 * ArrayList<String> arr = new ArrayList<String>(); 
		 * arr.add("aaa");
		 * arr.add(111); 문자열이 아니라 에러 뜨게 됨
		 */
		Scanner input = new Scanner(System.in);
		HashMap map = new HashMap(); //<> 제네릭 : 타입 지정(부여)
		String key = null, value=null;
		System.out.println("저장할 키 입력");
		key = input.next();
		System.out.println("저장할 값 입력");
		value = input.next();
		
		map.put(key, value);
		
		System.out.println(map);
	}

}
