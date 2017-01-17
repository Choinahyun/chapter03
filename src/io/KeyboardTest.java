package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

public class KeyboardTest {

	public static void main(String[] args) {
		BufferedReader br = null;
		
		try {
			// 기반 스트링은 System.in (표준 입력을 사용)
			InputStreamReader isr = new InputStreamReader (System.in, "utf-8");
			br = new BufferedReader (isr);
			
			String line = null;
			while(true) {
				line = br.readLine();
				if ("exit".equals(line)) {
					break;
				}
				System.out.println(line);
			}
			
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null) {
					br.close(); 
					}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
