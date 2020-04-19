package socket_server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_Ex {

	public static void main(String[] args) {
		
		BufferedReader in = null;
		BufferedReader stin = null;
		BufferedWriter out = null;
		ServerSocket listener = null;
		Socket socket = null;
		try {
			listener = new ServerSocket(9999);
			socket = listener.accept();
			System.out.println("¿¬°áµÊ");
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			stin = new BufferedReader(new InputStreamReader(System.in));
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			String inputMessage;
			while(true) {
				inputMessage = in.readLine();
				if(inputMessage.equalsIgnoreCase("bye"))break;
				System.out.println(inputMessage);
				String outMessage = stin.readLine();
				out.write("¼­¹ö>"+outMessage+"\n");
				out.flush();
			}
		}catch(IOException e) {
			System.out.println(e);
		}finally {
			try {
				socket.close();
				listener.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
