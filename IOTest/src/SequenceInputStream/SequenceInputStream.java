package SequenceInputStream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class SequenceInputStream {
	public static void main(String[] args) throws IOException {
		File f1=new File("g:"+File.separator+"1.txt");
		File f2=new File("g:"+File.separator+"2.txt");
		File f3=new File("g:"+File.separator+"3.txt");
		InputStream input1=new FileInputStream(f1);
		InputStream input2=new FileInputStream(f2);
		OutputStream Output3=new FileOutputStream(f3);
		java.io.SequenceInputStream sip=new java.io.SequenceInputStream(input1, input2);
		int line;
		try {
			while((line=sip.read())!=-1) {
				Output3.write(line);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		input1.close();
		input2.close();
		Output3.close();
		sip.close();
	}
}
