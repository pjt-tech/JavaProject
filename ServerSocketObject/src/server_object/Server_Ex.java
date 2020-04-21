package server_object;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

import client_object.Person;

public class Server_Ex {

	public static void main(String[] args) {
		
		ObjectInputStream in = null;
		BufferedWriter out = null;
		ServerSocket ss = null;

		try {
			ss = new ServerSocket(9997);
			Socket socket = ss.accept();
			System.out.println("���Ἲ��");
			in = new ObjectInputStream(socket.getInputStream());
			Person p = (Person)in.readObject();
			System.out.println(p);
			
			out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));	
			out.write("���� > ��ü���޹���");			
			out.flush();
			out.close();
			in.close();
			socket.close();
			
			
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
