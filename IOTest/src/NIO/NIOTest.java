package NIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIOTest {
	public static void main(String[] args) throws IOException {
		NIOTest t=new NIOTest();
		t.inputNIO();
		t.outputNIO();
		t.copyFile();
	}
	
	private void copyFile() {
		// TODO Auto-generated method stub
		
		
		
	}

	private void inputNIO() throws FileNotFoundException {
		// TODO Auto-generated method stub
		FileInputStream in=new FileInputStream(new File("g:"+File.separator+"test.txt"));
		FileChannel channel=in.getChannel();
		ByteBuffer byteB=ByteBuffer.allocate(1024);
		ByteBuffer byteA=ByteBuffer.allocate(1024);
		try {
			int m=channel.read(byteB);
			Byte[] b=new Byte[1000];
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			in.close();
			channel.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private void outputNIO() throws IOException {
		// TODO Auto-generated method stub
		FileOutputStream fout=new FileOutputStream("g:"+File.separator+"testWrite.txt");
		FileChannel fc=fout.getChannel();
		ByteBuffer buffer=ByteBuffer.allocate(1024);
		String[] message=new String[] {"","asdf","ff","d"};
		for(int i=0;i<message.length;i++) {
			buffer.put(message[i].getBytes());
		}
		buffer.flip();
		fc.write(buffer);
		try {
			fout.close();
			fc.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
