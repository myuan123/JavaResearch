package Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.charset.MalformedInputException;
import java.util.Scanner;

public class ScannerTest{
	
	public static void main(String[] args) throws FileNotFoundException {
		File file=new File("G:"+File.separator+"1.txt");
		Scanner sc=new 	Scanner(file);
		String str=sc.nextLine();
		System.out.println(str);
		sc.close();
	}
}
