package day08_Set_Map_String;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex02_Set {
	public static void main(String[] args) {
		ArrayList arr = new ArrayList();
		
		arr.add("��");
		arr.add("��");
		arr.add("��");
		
		for(int i=0; i<arr.size(); i++) {
			System.out.println(arr.get(i));	
		}
		
		Iterator it = arr.iterator(); // it�� ������ bof�� �˰� �ִ°�
//		System.out.println(it.hasNext()); // it.hasNext() : ���� ���� (�����ͷ�) �ֽ��ϱ�?
//		System.out.println(it.next()); //it.next() : �� ���� ���� �������
//		
//		System.out.println(it.hasNext());
//		System.out.println(it.next());
//		
//		System.out.println(it.hasNext());
//		System.out.println(it.next());
//		
//		System.out.println(it.hasNext());
//		System.out.println(it.next()); // ���� ������ ������ ��
//		
		//�ݺ������� �����
		for(int i=0; i<arr.size(); i++) {
			System.out.println(it.hasNext());
			System.out.println(it.next());
			if(it.hasNext()==false) break;
		}
		
		//�� Ǯ��
		while(it.hasNext() == true) {
			System.out.println(it.next());
		}
		
	}

}
