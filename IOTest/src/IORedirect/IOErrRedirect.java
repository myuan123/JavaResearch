package IORedirect;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class IOErrRedirect {
	public static void main(String[] args) throws FileNotFoundException {
		System.err.println("hello");
		System.setErr(new PrintStream(new File("G:"+File.separator+"1.txt")));
		System.err.print("hello againagian");
	}
}
