package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.StringTokenizer;

public class PhoneList01 {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
		// TODO Auto-generated method stub
		File file =new File("./phone.txt");
		if(file.exists() == false) {
			System.out.println("파일이 존재하지 않습니다.");
			return;
		}
		
		System.out.println("============파일 정보==========");
		System.out.println("경로 : "  + file.getAbsolutePath());
		System.out.println("크기 : " + file.length()+"Bytes");
		System.out.println("마지막 수정일 : " + new SimpleDateFormat("YYYY-MM-dd hh:mm:ss").format(new Date(file.lastModified())));
		
		System.out.println("==========전화 번호===========");
		br = new BufferedReader(new InputStreamReader(new FileInputStream(file),"UTF-8"));
		
		String line = null;
		
		while( (line = br.readLine()) != null) {
			System.out.println(line);
			StringTokenizer st = new StringTokenizer(line, "\t " );
			int index = 0;
			while(st.hasMoreTokens() ) {
				String s  = st.nextToken();
				if (index == 0) {
					System.out.print(s + ": " );
				}else if(index ==1) {
					System.out.print(s + "-" );
				}else if(index ==2) {
					System.out.print(s + "-" );
				}else {
					System.out.print(s);
				}			
				index++;
			}
			System.out.print("\n");
		}
		
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
		finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
