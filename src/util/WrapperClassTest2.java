package util;

public class WrapperClassTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Character.toLowerCase('a'));
		System.out.println(Character.isDigit('1'));
		System.out.println(Character.isDigit('@'));
		
		String s = "1234";
		
		if(s.matches("-?\\d+(\\.\\d+)")==false) {
			System.out.println("숫자가 아닙니다.");
		}else {
			int i = Integer.parseInt(s);
		}
		
		//프로그럄 로직(변수 검즘) 할때는 
		//try - catch로 하지 말것
		//메모리 비용 너무 높음.
//		try {
//			int i = Integer.parseInt(s);
//		}catch (NumberFormatException e) {
//			// TODO: handle exception
//			System.out.println("숫자가 아닙니다.");
//		}
		
		
		System.out.println(Integer.parseInt("10",10));
		System.out.println(Integer.parseInt("A",16));
		System.out.println(Integer.toBinaryString(255));
		System.out.println(Integer.toHexString(255));
		System.out.println(Double.parseDouble("44.13e-16"));
		System.out.println(Long.parseLong("1234567890"));
		
		System.out.println(String.valueOf(12345));
		
	}

}
