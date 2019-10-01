package ExceptionPractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

//ʹ�ù��캯���ر�reader�ķ�����reader��Ϊȫ�ֱ������棬�Ա���֮����dispose�����ر�reader
public class ResourceInConstructor {
	BufferedReader reader=null;
	public ResourceInConstructor() {
		try {
			InputStreamReader inputReader=new InputStreamReader(new FileInputStream(new File("G:\\Eclipseproject\\NestingClass\\File")));
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	public void readFile() {
		try {
			while(reader.readLine()!=null) {
				System.out.println(reader.readLine());
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void dispose() {
		try {
			reader.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
