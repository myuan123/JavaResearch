package ExceptionPractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

//使用构造函数关闭reader的方法，reader作为全局变量保存，以便于之后用dispose函数关闭reader
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
