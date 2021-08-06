package day08_Set_Map_String;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_Set {
	public static void main(String[] args) {
		// 16개의 공간 미리 만들어 놓음
		// 그리고 그 공간을 랜덤으로 저장 -> 인덱스로 찾기 불가
		// iterator을 이용하면 연속적으로 저장(정열?) 이럴때 iterator가 필요한거
		HashSet set = new HashSet();
		set.add("일");
		set.add("이");
		set.add("삼");
		System.out.println("set : "+set);
		
		Iterator it = set.iterator();
				
		while(it.hasNext()) {
			//Object o = it.next(); //it는 Object로 받아줘야함
			//String s = (String)o;
			String s = (String)it.next();
			System.out.println(s);
		}
		
	}

}
