package day08_Set_Map_String;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_Set {
	public static void main(String[] args) {
		// 16���� ���� �̸� ����� ����
		// �׸��� �� ������ �������� ���� -> �ε����� ã�� �Ұ�
		// iterator�� �̿��ϸ� ���������� ����(����?) �̷��� iterator�� �ʿ��Ѱ�
		HashSet set = new HashSet();
		set.add("��");
		set.add("��");
		set.add("��");
		System.out.println("set : "+set);
		
		Iterator it = set.iterator();
				
		while(it.hasNext()) {
			//Object o = it.next(); //it�� Object�� �޾������
			//String s = (String)o;
			String s = (String)it.next();
			System.out.println(s);
		}
		
	}

}
