package util;

public class WrapperTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer i = new Integer(10);
		Character c = new Character('c');
		Float f = new Float(3.14);
		Boolean b = new Boolean(true);
		
		Integer j = 10;
		
		//int k = 20 + j.intValue();
		int k = 20 + j;
		swap(i,k);
	}
	
	public static void swap(Integer a, Integer b) {
		//객체 이지만 내부를 수정할수 없다. 따라서 swap 구현 불가
	}

}
