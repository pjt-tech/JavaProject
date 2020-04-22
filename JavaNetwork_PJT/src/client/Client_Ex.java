package client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;


public class Client_Ex {

	public static void main(String[] args) {
		
		BufferedReader in = null;
		BufferedWriter out = null;
		Socket socket = null;
		try {
			
			String str = "Hello Java World";
			socket = new Socket("localhost",5001);
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			out.write(str);
			out.flush();
			
			System.out.println(str);
			while(true) {
			String serverMessage;	
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			serverMessage = in.readLine();
			socket.close();
			System.out.println(serverMessage);
			}			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
