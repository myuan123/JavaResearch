import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;

public class FileTest {
	public static void main(String[] args) throws IOException{
		OutputStreamWriterTest();
		InputStreamReaderTest();
	}
	
	private static void InputStreamReaderTest() throws IOException {
		// TODO Auto-generated method stub
		String fileName="d:"+File.separator+"hello.txt";
		File file=new File(fileName);
		Reader in=new InputStreamReader(new FileInputStream(file));
		char b[]=new char[100];
		int len=in.read(b);
		System.out.println(new String(b,0,len));
		in.close();
	}

	//将字节输出流转化为字符输出流
	private static void OutputStreamWriterTest() throws IOException{
		// TODO Auto-generated method stub
		String fileName="d:"+File.separator+"hello.txt";
		File file=new File(fileName);
		Writer out=new OutputStreamWriter(new FileOutputStream(file));
		out.write("hello");
		out.close();
	}
}
