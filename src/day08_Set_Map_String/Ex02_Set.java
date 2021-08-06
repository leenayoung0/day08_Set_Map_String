package day08_Set_Map_String;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex02_Set {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		
		arr.add("일");
		arr.add("이");
		arr.add("삼");
		
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));	
		}
		
		Iterator it = arr.iterator(); // it는 최초의 bof를 알고 있는거
//		System.out.println(it.hasNext()); // it.hasNext() : 다음 값이 (데이터로) 있습니까?
//		System.out.println(it.next()); //it.next() : 그 다음 값을 가지고옴
//		
//		System.out.println(it.hasNext());
//		System.out.println(it.next());
//		
//		System.out.println(it.hasNext());
//		System.out.println(it.next());
//		
//		System.out.println(it.hasNext());
//		System.out.println(it.next()); // 값이 없으니 에러가 남
//		
		//반복문으로 만들기
		for(int i=0; i<arr.size(); i++) {
			System.out.println(it.hasNext());
			System.out.println(it.next());
			if(it.hasNext()==false) break;
		}
		
		//쌤 풀이
		while(it.hasNext() == true) {
			System.out.println(it.next());
		}
		
	}

}
