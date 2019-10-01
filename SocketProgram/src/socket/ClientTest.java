package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

public class ClientTest {
	public static void main(String[] args) throws IOException {
		Socket socket=null;
		try {
			socket=new Socket("127.0.0.1",4700);
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
		PrintWriter os=new PrintWriter(socket.getOutputStream());
		BufferedReader in=new BufferedReader(new InputStreamReader(socket.getInputStream()));
		String readLine;
		readLine=bf.readLine();
		while(!readLine.equals("bye")||!in.readLine().equals("bye")) {
			os.println(readLine);
			os.flush();
			System.out.println("client:"+readLine);
			System.out.println("Server:"+in.readLine());
		}
		os.close();
		in.close();
		bf.close();
	}
}
