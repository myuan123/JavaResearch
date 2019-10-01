import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Writer;

public class IOTest {
	public static void main(String[] args) throws IOException{
		IOTest iot=new IOTest();
		iot.writeFile();
		iot.readFile();
		iot.writerDemo();
		iot.exerciseRangeOfRobot(10,1,100);
	}

	private void exerciseRangeOfRobot(int threshold,int rows,int cols) {
		int count=0;
        int sum=0;
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                String horizon=String.valueOf(i);
                String longitude=String.valueOf(j);
                char[] horizon1=horizon.toCharArray();
                char[] longitude1=longitude.toCharArray();
                sum=0;
                sum=calculateSum(horizon1,longitude1,sum);
                System.out.println("horizon coordination "+horizon+" "+longitude);
                System.out.println("sum is "+sum );
                if(sum<=threshold){
                    count++;
                }
                
            }
        }
        System.out.println(count+"  "+sum);
		
	}

	private int calculateSum(char[] horizon1, char[] longitude1, int sum) {
		// TODO Auto-generated method stub
		for(int i=0;i<horizon1.length;i++){
            sum=sum+Integer.parseInt(String.valueOf(horizon1[i]));
        }
        for(int j=0;j<longitude1.length;j++){
            sum=sum+Integer.parseInt(String.valueOf(longitude1[j]));
        }
		return sum;
	}

	private void writerDemo() throws IOException {
		File f=new File("F:/2019 spring semester/2.txt");
		Writer out;
		out=new FileWriter(f,true);
		String str="Hello,World";
		out.write("\r\n");
		out.write(str);
		out.flush();
		out.close();
	}

	private void readFile() throws IOException {
		File f=new File("F:/2019 spring semester/1.txt");
		InputStream ip;
		ip=new FileInputStream(f);
		
	}

	private void writeFile() throws IOException {
		File f=new File("F:/2019 spring semester/1.txt");
		OutputStream out;
		out=new FileOutputStream(f);
		String s="Hello,world";
		char a='a';
		byte[] array=s.getBytes();
		out.write(array);
		out.flush();
		out.close();
		char cc='1';
		System.out.println((int)cc);
	}
}
