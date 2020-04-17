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
			System.out.println("서버 소켓이 생성되었습니다.");
			while(true) {
				Socket socket = serverSocket.accept();
				ObjectInputStream inStream = new ObjectInputStream(socket.getInputStream());
				Object obj = inStream.readObject();
				System.out.println("입력받은 내용 : " + obj);
				ObjectOutputStream outStream = new ObjectOutputStream(socket.getOutputStream());
				
				
				if(obj.equals("WRITE")) {
					int count = (int)inStream.readObject();
					ObjectOutputStream fileSave = new ObjectOutputStream(new FileOutputStream(new File("list.txt")));
					fileSave.writeObject(count);
					System.out.println("전달한 리스트의 뷰의 개수  : " + count);
					for(int i = 0; i<count; i++) {
						Object itemObj = inStream.readObject();
						SongItem item = (SongItem)itemObj;
						fileSave.writeObject(item);
					}
					fileSave.flush();
					fileSave.close();
					System.out.println("파일 list.txt에 데이터 쓰기 완료");
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
					System.out.println("파일 list.txt에서 데이터 읽기 완료");
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
