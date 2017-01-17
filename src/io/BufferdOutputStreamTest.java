package io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferdOutputStreamTest {

	public static void main(String[] args) {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		try {
			fos = new FileOutputStream ("1234.txt");
			bos = new BufferedOutputStream(fos);
			
			for (int i= '1'; i<'9'; i++) {
				fos.write(i);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일 열기 실패: " + e);
		} catch (IOException e) {
			System.out.println("파일 I/O 실패: " + e);
		} finally {
			try {
				if (bos != null) {
					bos.close(); 
					}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
