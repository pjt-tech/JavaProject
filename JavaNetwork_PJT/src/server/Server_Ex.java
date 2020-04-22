package server;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server_Ex {

	public static void main(String[] args) {
		BufferedReader in = null;
		BufferedWriter out = null;
		ServerSocket ss = null;
		Socket socket = null;
		
		try {
			ss = new ServerSocket(5001);
			System.out.println("Starting Java Socket Server...");
			System.out.println("Listening at port 5001...");
			socket = ss.accept();					
			int port = socket.getLocalPort();
			InetAddress ip = socket.getLocalAddress();
			System.out.println("Connect..");			
			System.out.println("A Client connected host : " +ip+ " port : "+ port );
			
			while(true) {
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String clientMessage;
			clientMessage = in.readLine();
			System.out.println("Input : " + clientMessage);		
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));				
			out.write(clientMessage+"from Server.");
			out.flush();
			out.close();
			}
					
			
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
