package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

public class FileReaderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Reader reader = null;
		InputStream is = null;
		int data = -1;
		int count = 0;
		try {
			reader = new FileReader("./hello.txt");
			is = new FileInputStream("./hello.txt");
			
			while ( (data = reader.read() )!= -1) {
				count ++;
				System.out.println((char)data);
			}
			System.out.println("\n 읽은 회수 : "+ count);
			System.out.println("=====================");
			count = 0;
			data = -1;
			while ((data = is.read())!= -1 ) {
				count ++;
				System.out.println((char)data);
			}
			System.out.println("\n 읽은 회수 : "+ count);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("파일 없음 : " + e);
		} catch (IOException e) {
			System.out.println("I/O에러 : " + e);
		}
		finally {
			try {
				if (reader != null) {
					reader.close();
				}
				if (is != null) {
					is.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
