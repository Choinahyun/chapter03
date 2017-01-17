package io;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderTest {

	public static void main(String[] args) {
		BufferedReader br = null;
		try {
			FileReader fr = new FileReader("./src/io/BufferedReaderTest.java");
			br = new BufferedReader(fr);
			
			String line = null;
			int index = 0;
			while ((line = br.readLine()) != null) {
				System.out.println(++index + ":" + line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("open fail:" + e);
		} catch (IOException e) {
			System.out.println("file io fail:" + e);
		} finally {
			try {
				if (br != null) {
					br.close(); 
					}
			} catch (IOException e) {
				System.out.println("close fail:" +e);
			}
		}
		
		
		

	}

}
