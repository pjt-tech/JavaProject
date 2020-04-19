package socket_server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_Ex01 {

	public static void main(String[] args) {
		
		try {
			ServerSocket ss = new ServerSocket(9998);
			Socket socket = ss.accept();
			System.out.println("서버 연결됨");
			
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			String inMessage;
			while(true) {
			inMessage =  br.readLine();
			if(inMessage.equalsIgnoreCase("bye"))break;
			
			System.out.println(inMessage);
			String outMessage = in.readLine();
			out.write("서버>"+outMessage+"\n");
			out.flush();
				
			}
			socket.close();
			br.close();
			in.close();
			out.close();
			
			
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}

}
