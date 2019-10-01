package zipoutstream;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamTest {

	public static void main(String[] args) throws Exception {
		File file=new File("G:"+File.separator+"4.txt");
		File zipFile=new File("G:"+File.separator+"file.zip");
		InputStream ip=new FileInputStream(file);
		ZipOutputStream zipOut=new ZipOutputStream(new FileOutputStream(zipFile));
		zipOut.putNextEntry(new ZipEntry(file.getName()));
		zipOut.setComment("Contract the file into zip");
		int temp=0;
		while((temp=ip.read())!=-1) {
			zipOut.write(temp);
		}
		ip.close();
		zipOut.close();
	}
}
