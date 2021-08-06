package day08_Set_Map_String;

import java.util.Scanner;

public class Ex07_String {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String str= new String();
		//String str; 둘다 같음
		
		System.out.println(str);
		System.out.println("문자열 입력");
		str = input.next();
		System.out.println("입력받은 문자열 : "+str);
	}

}
