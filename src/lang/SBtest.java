package lang;

public class SBtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	      //생성
	      StringBuffer sb = new StringBuffer("This");
	      System.out.println(sb.length() + ":" + sb.capacity() );
	      System.out.println( sb );
	      
	      //문자열 추가
	      sb.append(" is pencil" );
	      System.out.println(sb);
	      
	      //삽입
	      sb.insert(8, "my");
	      System.out.println( sb );
	      
	      //치환
	      sb.replace(8, 10, "yours");
	      System.out.println( sb );
	      
	      //버퍼 크기 조정
	      sb.setLength(3);
	      System.out.println(sb);
	      
	      //문자열 + 연산은 내부적으로 StringBuffer로 객체로 변환
	      String s1 = "Hello" + "World" + 10 + true;
	      System.out.println(s1);
	      
	      //StringBuffer sb2 = new StringBuffer("Hello");
	      //StringBuffer sb3 = sb2.append("World");
	      String s2 = new StringBuffer("Heelo").append("World").append(10).append(true).toString();
	      
	      System.out.println(s2);
	      
	      

	}

}
