package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Ex04_Map {
	public static void main(String[] args) {
		/*
		 Map
		 - HashMap
		 - TreeMap
		 - HashTable..��
		 HashMap
		 - Ű�� ���� ���̴� key, value
		 - ������ �������� �ʴ´�
		 - Ű�� ���� �ߺ��� ������� �ʴ´�.
		 LinkedHashMap
		 - �������� ����
		 */
		//HashMap map = new HashMap();
		LinkedHashMap map = new LinkedHashMap();
		map.put("��ǳ��", "1000����");
		map.put("�ڵ���", "10����");
		map.put("������", "30����");
		
		System.out.println(map);
		
		System.out.println(map.get("��ǳ��"));
		System.out.println(map.get("�ڵ���"));
		System.out.println(map.get("������"));
		System.out.println(map.get("����Ű"));
		
		System.out.println(map.containsKey("������")); //�ش��ϴ� Ű�� �ֳ�
		System.out.println(map.containsKey("������111"));
		
		System.out.println(map.containsValue("30����")); //�ش��ϴ� ���� �ֳ�
		System.out.println(map.containsValue("31����"));
		
		System.out.println(map.remove("������"));
		System.out.println(map.containsKey("������"));
		System.out.println(map.containsValue("30����"));
		System.out.println(map);
		
		System.out.println(map.keySet());
		
		//Set s = map.keySet();
		//Iterator it = s.iterator();
		Iterator it = map.keySet().iterator();
		while(it.hasNext()) {
			String key = (String)it.next();
			System.out.println(key+" : "+map.get(key));
		}
		
		
		
		
	}

}
