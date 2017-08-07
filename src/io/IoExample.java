package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

public class IoExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] src = {0,1,2,3};
		byte[] dest = null;
		try {
			InputStream is = new ByteArrayInputStream(src);
			OutputStream os = new ByteArrayOutputStream();
			int data = -1;
			while((data = is.read()) != -1) {
				os.write(data);
			}
			
			dest = ((ByteArrayOutputStream)os).toByteArray();
			//배열을 tostring 해주는 메소드
			System.out.println(Arrays.toString(src));
			System.out.println(Arrays.toString(dest));
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
