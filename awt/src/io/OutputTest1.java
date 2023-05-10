package io;

import java.io.IOException;
import java.io.OutputStream;

public class OutputTest1 {
	public static void main(String[] args) {
		byte b[] = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};
		OutputStream os = System.out;
		try {
			os.write(b);
			os.flush();
			os.close();
		} catch(IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
