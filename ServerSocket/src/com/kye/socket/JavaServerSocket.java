package com.kye.socket;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

import com.kye.file_listview.*;

public class JavaServerSocket {

	public static void main(String[] args) {
		
		try {
			ServerSocket serverSocket = new ServerSocket(11000);
			System.out.println("���� ������ �����Ǿ����ϴ�.");
			while(true) {
				Socket socket = serverSocket.accept();
				ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());
				Object obj = inStream.readObject();
				System.out.println("�Է¹��� ���� : " + obj);
				ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
				
				
				if(obj.equals("WRITE")) {
					int count = (int)inStream.readObject();
					ObjectOutputStream fileSave = new ObjectOutputStream(new FileOutputStream(new File("list.txt")));
					fileSave.writeObject(count);
					System.out.println("������ ����Ʈ�� ���� ����  : " + count);
					for(int i = 0; i<count; i++) {
						Object itemObj = inStream.readObject();
						SongItem item = (SongItem)itemObj;
						fileSave.writeObject(item);
					}
					fileSave.flush();
					fileSave.close();
					System.out.println("���� list.txt�� ������ ���� �Ϸ�");
				}else if(obj.equals("READ")) {
					ObjectInputStream fileOpen = new ObjectInputStream(new FileInputStream(new File("list.txt")));
					int count = (int)fileOpen.readObject();
					outStream.writeObject(count);
					for(int i = 0; i<count; i++) {
						Object itemObj = fileOpen.readObject();
						SongItem item = (SongItem)itemObj;
						outStream.writeObject(item);
					}
					outStream.flush();
					fileOpen.close();
					System.out.println("���� list.txt���� ������ �б� �Ϸ�");
				}
				
				inStream.close();
				outStream.close();
				socket.close();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}

	}

}
