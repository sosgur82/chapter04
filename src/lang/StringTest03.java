package lang;

public class StringTest03 {
	public static void main(String[] args) {
		String s = "as;ldk;lasldkas";
		
		//charAt
		char c = s.charAt(2);
		System.out.println(c);
		
		//indexOf
		System.out.println(s.indexOf("as"));
		System.out.println(s.indexOf("las"));
		System.out.println(s.lastIndexOf("as"));
		System.out.println(s.indexOf("XYZ"));
		
		//replace(치환)
		System.out.println(s.replace(";","1"));
		System.out.println(s.replace("ldk", "sos"));
		System.out.println(s.replaceAll("la","12"));
		
		//substring
		System.out.println(s.substring(3,7));
		
		//case
		System.out.println(s.toLowerCase());
		System.out.println(s.toUpperCase());
		
		//concat
		String str1 = " ab cd    ";
		String str2 = ",efg";
		
		System.out.println(str1.concat(str2));
		
		//trim(앞뒤 공백제거)ㅒ
		System.out.println("---" + str1 + "---");
		System.out.println("---" + str1.trim() + "---");
		
		//split
		String[] tokens = str1.split(",");
		for(String Token : tokens) {
			System.out.println(Token);
		}
		
		//split 에러
		tokens = "abcdefg".split(",");
		for(String Token : tokens) {
			System.out.println(Token);
		}
		
		tokens = "".split(",");
		System.out.println(tokens);
		
		
		
	}
}
