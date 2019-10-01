package BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader {
	public static void main(String[] args) throws IOException {
		java.io.BufferedReader buf=null;
		try {
		buf=new java.io.BufferedReader(new InputStreamReader(System.in));
		String line;
		while((line=buf.readLine())!=null) {
			System.out.println(line);
		}
		}finally {
			buf.close();
		}
		
	}
}
