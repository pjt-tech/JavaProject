package client_object;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.net.Socket;


public class Client_Ex {

	public static void main(String[] args) {
		
		ObjectOutputStream out = null;
		BufferedReader in = null;
		
		try {
			Socket socket = new Socket("localhost",9997);
			out = new ObjectOutputStream(socket.getOutputStream());
			Person p = new Person("¹Ú±º",20);
			out.writeObject(p);
			out.flush();
			in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			String Message;
			Message=in.readLine();	
			System.out.print(Message);									
			in.close();
			out.close();
			socket.close();			
		}catch(IOException e) {
			e.printStackTrace();
		}
		
	}

}
