package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamTest {
	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		BufferedOutputStream bos = null;
		try {
			bos = new BufferedOutputStream(new FileOutputStream("./123.txt"));
			//데코레이션 패턴 객체 확장하는거?
					for(int i='1'; i<= '9'; i++) {
						bos.write( i );
						//버퍼가 풀나지 않은 상태에서 플러시를 강제로함.
						bos.flush();
						//버퍼 풀이면 자동 플러시함.
						//close() 호출하면 자동 플러시
					}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일 없음 : " + e);
		} catch (IOException e) {
			System.out.println("파일 I/O에러 : " + e);
		}finally{
			if(bos != null)
			{
				 try {
					bos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
