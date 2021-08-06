package day08_Set_Map_String;

public class Quiz03_String {
	public static void main(String[] args) {
		String str = "김개똥 -2017년\n홍길동구리 -2015년\n선우선녀 -2018년";
		
		System.out.println("====변경 전 str====");
		System.out.println(str);
		
		System.out.println("====변경 후 str====");
		String replace1 = str.replace("-2017", ":1999");
		String replace2 = replace1.replace("-2015", ":1999");
		String replace3 = replace2.replace("-2018", ":1999");
		System.out.println(replace3);
	
	}

}
