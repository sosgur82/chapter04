package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class KeyBoardTest {

	public static void main(String[] args) {
		BufferedReader br=null;
		// TODO Auto-generated method stub
		try {
			br = new BufferedReader( new InputStreamReader(System.in, "UTF-8"));
			
			while(true) {
				System.out.print(">>");
				String line = br.readLine();
				
				if(line == null) {
					break;
				}
				
				if("exit".equals(line)) {
					break;
				}
				
				System.out.println(line);
			}
			
		
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			System.out.println("지원하지 않는 charset: " + e);
		} catch (IOException e) {
			System.out.println("I/O에러 : " + e);
		}finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
