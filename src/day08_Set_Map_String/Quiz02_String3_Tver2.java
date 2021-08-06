package day08_Set_Map_String;

public class Quiz02_String3_Tver2 {
	public static void main(String[] args) {
		String str = "tESt  sTring     change       first";
		String changeStr = new String();
		
		str = str.toLowerCase();
		// \\s+ : 정규표현식 공백 하나 이상을 기준으로 split
		//String[] arr = str.split("\\s+"); // 아래 if문의 length() != 0 필요 없다
		String[] arr = str.split(" ");

		for(int i=0 ; i<arr.length ; i++) {
			int k=0;
			System.out.println(arr[i]);
			if(arr[i].length() !=0 && arr[i].charAt(0) >= 'a' && arr[i].charAt(0) <='z') {
				while(k < arr[i].length()) {
					if(k == 0) {
						changeStr += (char)(arr[i].charAt(k)-32);
					}else {
						changeStr += (char)(arr[i].charAt(k));
					}
					k++;
				}
				changeStr += ' ';
			}else {
				changeStr += ' ';
			}
		}
		System.out.println(changeStr);
	
	}
}
