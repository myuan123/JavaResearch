package socket;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerTest {
	public static void main(String[] args) {
		try {
			ServerSocket server=null;
			try {
				server=new ServerSocket(4700);
			}catch(Exception e) {
				System.out.println("can not listen to"+e);
			}
			Socket socket=null;
			try {
				socket=server.accept();
				
			}catch(Exception e){
				System.out.println("Error"+e);
			}
			String line;
			BufferedReader is=new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter print=new PrintWriter(socket.getOutputStream());
			BufferedReader sin=new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Client"+is.readLine());
			line=sin.readLine();
			while(!line.equals("bye")) {
				print.println(line);
				print.flush();
				System.out.println("server:"+line);
				System.out.println("Client"+is.readLine());
				line=sin.readLine();
			}
			print.close();
			is.close();
			socket.close();
			server.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Exception:"+e);
		}
	}
}
