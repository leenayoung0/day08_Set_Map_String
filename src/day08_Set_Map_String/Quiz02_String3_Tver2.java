package day08_Set_Map_String;

public class Quiz02_String3_Tver2 {
	public static void main(String[] args) {
		String str = "tESt  sTring     change       first";
		String changeStr = new String();
		
		str = str.toLowerCase();
		// \\s+ : ����ǥ���� ���� �ϳ� �̻��� �������� split
		//String[] arr = str.split("\\s+"); // �Ʒ� if���� length() != 0 �ʿ� ����
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
