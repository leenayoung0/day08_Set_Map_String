package day08_Set_Map_String;

public class Quiz03_String {
	public static void main(String[] args) {
		String str = "�谳�� -2017��\nȫ�浿���� -2015��\n���켱�� -2018��";
		
		System.out.println("====���� �� str====");
		System.out.println(str);
		
		System.out.println("====���� �� str====");
		String replace1 = str.replace("-2017", ":1999");
		String replace2 = replace1.replace("-2015", ":1999");
		String replace3 = replace2.replace("-2018", ":1999");
		System.out.println(replace3);
	
	}

}
