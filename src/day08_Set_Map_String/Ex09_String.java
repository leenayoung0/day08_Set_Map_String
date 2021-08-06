package day08_Set_Map_String;

public class Ex09_String {
	public static void main(String[] args) {
		String str = new String("abcdefg");
		System.out.println(str.length());
		System.out.println(str.charAt(2)); // 인덱스 번호 사용해서 찾으려면 get이나 []아니고 charAt
		
		str += "안녕하세요"; // 연산은 그냥 붙여쓰기
		System.out.println(str);
		
		System.out.println(str.equals("abcdefg안녕하세요"));
		System.out.println(str == ("abcdefg안녕하세요")); // 이거 안됨
		
		System.out.println(str.charAt(0)=='a');
		System.out.println(str.charAt(0)=='b');
		
		System.out.println(str.charAt(0)-32);
		System.out.println((char)(str.charAt(0)-32));
		
	}

}
