package io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.Arrays;

public class IOExample {

	public static void main(String[] args) {

		byte[] src = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		byte[] dest = null;
		
		ByteArrayInputStream bais = new ByteArrayInputStream(src);

		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		
		int data = 0;
		
		while ((data = bais.read()) != -1) {
			baos.write(data);
		}
		
		dest = baos.toByteArray();
		
		System.out.println(Arrays.toString(src));
		System.out.println(Arrays.toString(dest));
	}

}
