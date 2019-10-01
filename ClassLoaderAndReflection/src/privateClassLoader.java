import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class privateClassLoader extends ClassLoader{
	private String path;
	
	public privateClassLoader(String path) {
		this.path=path;
	}
	
	@Override
	protected Class<?> findClass(String name) throws ClassNotFoundException {
		Class car=null;
		byte[] classData=getData();
		
		if(classData!=null) {
			//将class的字节码转化称为class类的实例
			car=defineClass(name,classData,0,classData.length);
		}
		return super.findClass(name);
	}

	private byte[] getData() {
		File file=new File(path);
		if(file.exists()) {
			FileInputStream in=null;
			ByteArrayOutputStream out=null;
			try {
				in=new FileInputStream(file);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			out=new ByteArrayOutputStream();
			byte[] buffer=new byte[1024];
			int size=0;
			try {
				while((size=in.read(buffer))!=-1) {
					out.write(buffer,0,size);
				}
				return out.toByteArray();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}else {
			return null;
		}
		return null;
	}
	
	
}
