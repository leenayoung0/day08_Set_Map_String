package day08_Set_Map_String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class Quiz01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num, price, newPrice, n, editP;
		String menu, newMenu, name;
		
		HashMap map = new HashMap();
		
		
		while(true) {
			System.out.println("1.�޴� ���");
			System.out.println("2.�޴��� ���� ����");
			System.out.println("3.�� ��");
			System.out.print(">>>");
			num = sc.nextInt();
			
			switch(num) {
			case 1: System.out.print("�޴� �Է� : ");
					newMenu = sc.next();
					if(map.containsKey(newMenu)) {
						System.out.println("�����ϴ� �޴� �Դϴ�");
						break;
					}
					
					System.out.print("���� �Է� : ");
					newPrice = sc.nextInt();
					
					map.put(newMenu, newPrice);
					System.out.println("��� �Ǿ����ϴ�.");
					
			case 2: Iterator it = map.keySet().iterator();
					while(true) {
						for(int i=1; i<=map.size(); i++) {
							while(it.hasNext()) {
								String key = (String)it.next();
								System.out.println(i+". "+key+" : "+map.get(key));	
							}
						}
						
						System.out.println("1.���� 2.���� 3.������");
						System.out.print(">>>");
						n = sc.nextInt();
						
						if(n==1) {
							System.out.print("���� �޴��̸� �Է� : ");
							name = sc.next();
							if(map.containsKey(name)==false) {
								System.out.println("�޴��� �����ϴ�!!!");
								break;
							}
							System.out.print("���� ���� �Է� : ");
							editP = sc.nextInt();
							System.out.println(map.get(name)+"->"+editP);
							map.remove(name);
							map.put(name, editP);
							System.out.println("���� �ƽ��ϴ�.!!!");
							break;
						}
						
						if(n==2) {
							System.out.print("������ �޴��̸� �Է� : ");
							name = sc.next();
							if(map.containsKey(name)==false) {
								System.out.println("�޴��� �����ϴ�!!!");
								break;
							}
							map.remove(name);
							System.out.println("���� �ƽ��ϴ�.!!!");
							break;
						}
						if(n==3) break;
							
					}
					
			case 3: System.exit(1);
			
			}
			
		}
	}

}
