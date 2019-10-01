package zipoutstream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
import java.util.zip.ZipInputStream;

//如果原来文件夹中有这个文件，会覆盖原来的文件
public class DeZipTest {
	public static void main(String args[]) throws IOException {
		File file=new File("g:"+File.separator+"file.zip");
		File outFile=null;
		
		ZipFile zipfile=new ZipFile(file);
		ZipInputStream zipInput=new ZipInputStream(new FileInputStream(file));
		
		ZipEntry entry=null;
		InputStream input=null;
		OutputStream output=null;
		
		while((entry=zipInput.getNextEntry())!=null) {
			
			System.out.println("dezip "+entry.getName());
			outFile=new File("g:"+File.separator+entry.getName());
			if(!outFile.getParentFile().exists()) {
				outFile.getParentFile().mkdir();
			}
			if(!outFile.exists()) {
				outFile.createNewFile();
			}
			
			input=zipfile.getInputStream(entry);
			output=new FileOutputStream(outFile);
			int temp=0;
			while((temp=input.read())!=-1) {
				output.write(temp);
			}
			input.close();
			output.close();
		}
	}
}
