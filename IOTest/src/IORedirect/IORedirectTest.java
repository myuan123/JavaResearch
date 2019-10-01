package IORedirect;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class IORedirectTest {
	public static void main(String[] args) throws FileNotFoundException {
		System.out.println("hello");
		
		System.setOut(new PrintStream(new File("G:"+File.separator+"1.txt")));
		
		
		System.out.println("hello again");
	}
}
