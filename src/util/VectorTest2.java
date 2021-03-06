package util;

import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class VectorTest2 {
	public static void main(String[] args) {
	List<String> list = new Vector<String>();
	
	//삽입
	list.add("둘리");
	list.add("마이콜");
	list.add("도우너");
	
	
	//순회
	int count = list.size();
	for(int i =0; i<count; i++) {
		String s = list.get(i);
		System.out.println(s);
	}
	
	//제거 
	list.remove(1);
	
	//순회2
	Iterator<String> it = list.iterator();
	while (it.hasNext()) {
		String s = it.next();
		System.out.println(s);
	}
	
	//순회3
	for(String s : list) {
		System.out.println(s);
	}
	
}
}
