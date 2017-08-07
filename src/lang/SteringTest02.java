package lang;

public class SteringTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "abc";
		String str2 = "cde";
		String str3 = str2;
		
		str2 = str3.toUpperCase();
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		String str4 = str2.concat("??");
		System.out.println(str2);
		System.out.println(str4);
		
		//String s = "1";
		//String str5 = s.concat(str2);
		
		//위에 두줄이랑 똑같은 코드
		//메소드 체인(Method Chain)
		String str5 = "1".concat(str2).concat("@");
	}

}
