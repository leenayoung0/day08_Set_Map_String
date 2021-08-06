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
			System.out.println("1.메뉴 등록");
			System.out.println("2.메뉴별 가격 보기");
			System.out.println("3.종 료");
			System.out.print(">>>");
			num = sc.nextInt();
			
			switch(num) {
			case 1: System.out.print("메뉴 입력 : ");
					newMenu = sc.next();
					if(map.containsKey(newMenu)) {
						System.out.println("존재하는 메뉴 입니다");
						break;
					}
					
					System.out.print("가격 입력 : ");
					newPrice = sc.nextInt();
					
					map.put(newMenu, newPrice);
					System.out.println("등록 되었습니다.");
					
			case 2: Iterator it = map.keySet().iterator();
					while(true) {
						for(int i=1; i<=map.size(); i++) {
							while(it.hasNext()) {
								String key = (String)it.next();
								System.out.println(i+". "+key+" : "+map.get(key));	
							}
						}
						
						System.out.println("1.수정 2.삭제 3.나가기");
						System.out.print(">>>");
						n = sc.nextInt();
						
						if(n==1) {
							System.out.print("변경 메뉴이름 입력 : ");
							name = sc.next();
							if(map.containsKey(name)==false) {
								System.out.println("메뉴가 없습니다!!!");
								break;
							}
							System.out.print("수정 가격 입력 : ");
							editP = sc.nextInt();
							System.out.println(map.get(name)+"->"+editP);
							map.remove(name);
							map.put(name, editP);
							System.out.println("변경 됐습니다.!!!");
							break;
						}
						
						if(n==2) {
							System.out.print("삭제할 메뉴이름 입력 : ");
							name = sc.next();
							if(map.containsKey(name)==false) {
								System.out.println("메뉴가 없습니다!!!");
								break;
							}
							map.remove(name);
							System.out.println("삭제 됐습니다.!!!");
							break;
						}
						if(n==3) break;
							
					}
					
			case 3: System.exit(1);
			
			}
			
		}
	}

}
