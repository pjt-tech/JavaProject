package socket_client;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;


public class Client_Ex01 {

	public static void main(String[] args) {
		
		try {
			Socket socket = new Socket("localhost",9998);
			BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter out = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			String outMessage;
			while(true) {
				
			outMessage = in.readLine();
			if(outMessage.equalsIgnoreCase("bye")) break;
			out.write("클라이언트> "+outMessage+"\n");
			out.flush();
			
			String inMessage = br.readLine();
			System.out.println(inMessage);
			
			}
			
			out.close();
			in.close();
			br.close();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
