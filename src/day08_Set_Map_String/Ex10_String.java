package day08_Set_Map_String;

public class Ex10_String {
	public static void main(String[] args) {
		String str = "   Have a nice day     ";
		String result = str.trim(); // trim 양옆 공백 지워줌
		System.out.println("1."+str);
		System.out.println("2."+result);
		
		String[] split = result.split(" ");
		System.out.println(split[0]);
		System.out.println(split[1]);
		System.out.println(split[2]);
		System.out.println(split[3]);
		
		String addr = "101/서울시/종로구/종로3가 100번지/4층";
		String[] ad = addr.split("/");
		for(int i = 0; i <ad.length; i++) {
			System.out.println(ad[i]);
		}
		
		String replace = result.replace(" ","+++");
		System.out.println(replace);
	}

}
