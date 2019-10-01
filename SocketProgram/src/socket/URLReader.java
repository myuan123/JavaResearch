package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

public class URLReader {
	public static void main(String[] args) throws IOException {
		BufferedReader bf=null;
		try{
		URL url=new URL("http://www.baidu.com");
		bf=new BufferedReader(new InputStreamReader(url.openStream()));
		String line="";
		while((line=bf.readLine())!=null) {
			System.out.println(line);
		}
		}finally {
			bf.close();
		}
	}
}
