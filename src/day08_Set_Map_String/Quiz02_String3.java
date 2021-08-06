package day08_Set_Map_String;

public class Quiz02_String3 {
	public static void main(String[] args) {
		//3번 문제
		
		String str = new String("tESt sTring    change     first");
		String changeStr = new String();
		
		 String str2 = str.toLowerCase();
		
		String replace = str.replace(" ","+");
		System.out.println(replace);
		
		String[] split = str2.split(" ");
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[5]);
		System.out.println(split[10]);
		
		String replace1 = split[0].replace("t", "T");
		String replace2 = split[1].replace("s", "S");
		String replace3 = split[5].replace("c", "C");
		String replace4 = split[10].replace("f", "F");

		
		changeStr = replace1+" "+replace2+"    "
					+replace3+"     "+replace4;
		System.out.println("변경 전 : "+ str);
		System.out.println("변경 후 : "+changeStr);
	}

}
