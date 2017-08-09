package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;

public class InPutStreamReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader reader = null;
		try {
			reader = new InputStreamReader(new FileInputStream("./ms949.txt"),"MS949");
			int data = -1;
			while( (data = reader.read())!= -1 ){
				System.out.print((char)data);
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일 없음 : " + e);
		} catch (UnsupportedEncodingException e) {
			System.out.println("지원하지 않는 charset: " + e);
		} catch(IOException e) {
			System.out.println("I/O에러 : " + e);
		}
		finally {
			try {
				if(reader != null) {
				reader.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
