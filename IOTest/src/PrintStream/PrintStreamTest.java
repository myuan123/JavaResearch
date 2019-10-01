package PrintStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.net.URL;

public class PrintStreamTest {
	public static void main(String[] args) throws IOException {
		
		URL url=PrintStreamTest.class.getClassLoader().getResource("file.txt");
		System.out.println("URL.getAuthority "+url.getAuthority());
		System.out.println("URL.getFileName "+url.getFile());
		System.out.println("URL.getAnchor "+url.getRef());
		System.out.println("URL.getUserInfo "+url.getUserInfo());
		File f=new File(url.getPath());
		File ff=new File("G:\\1.txt");
		PrintStream printStream;
		//¥À¥¶–¥»Îff
		printStream=new PrintStream(new FileOutputStream(ff));
		printStream.print("asdf");
		printStream.println(true);
		printStream.append("123");
		printStream.close();
	}
}
