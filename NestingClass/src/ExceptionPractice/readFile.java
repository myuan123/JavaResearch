package ExceptionPractice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class readFile {
	public void readFile() {
		File f=new File("G:\\Eclipseproject\\NestingClass\\File");
		InputStreamReader reader=null;
		try {
			FileInputStream fileInputStream=new FileInputStream(f);
			reader=new InputStreamReader(fileInputStream);
		}catch(FileNotFoundException e){
			e.printStackTrace();
		//��֤���������н������׳��쳣ʱ�ر�reader
		}finally{
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public void readFileTryAgain() {
		BufferedReader reader=null;
		File f=new File("G:\\Eclipseproject\\NestingClass\\File");
			try {
				try {
					reader=new BufferedReader(new InputStreamReader(new FileInputStream(f)));
				}finally {
					reader.close();
				}
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}catch(IOException e) {
				e.printStackTrace();
			}
		
	}
	
	
	
}
