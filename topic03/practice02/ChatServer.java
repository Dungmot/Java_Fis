package fis.topic03.practice02;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChatServer {
	public static void main(String[] args) {
		List<DataChatBot> listKH = new ArrayList<DataChatBot>();
		// doc file
		try {
			FileReader fr = new FileReader(
					"CSKH.txt");
			BufferedReader br = new BufferedReader(fr);
			String s = "";
			while ((s = br.readLine()) != null) {
				String a[] = s.split("\\$");
				DataChatBot kh = new DataChatBot(a[0], a[1], a[2]);
				listKH.add(kh);
			}
			br.close();
			fr.close();
		} catch (Exception e) {
		}

		try {
			ServerSocket myServer = new ServerSocket(2811);
			System.out.println("Server da khoi tao");
			while (true) {
				Socket socket = myServer.accept();
				dos.writeUTF("Client da ket noi");
				//List client vừa kết nối
				//thread chờ tin nhắc từ client khác
				DataInputStream dis = new DataInputStream(socket.getInputStream());
				DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
				// xuly
				Scanner sc = new Scanner(System.in);
				int k = 0;
				String message = "";
				message = "Xin chào Bạn! Mùa hè đến rồi bạn đã chuẩn bị gì cho 1 chuyến đi du lịch chưa? \n1. Tiếp tục\n2. Ket thuc\nMoi ban nhap lựa chọn (1 hay 2): ";
				dos.writeUTF(message);
				k = Integer.parseInt(dis.readUTF());
				if (k == 1) {
					message = "";
					while (true) {
					String choice1 = dis.readUTF();
					System.out.println(choice1);
					if (choice1.equals("tam biet")) {
								System.out.println("Cam on ban da su dung chuong trinh");
								dos.writeUTF(message);
								//xóa client này đi
								break;
							}
					for (DataChatBot kh1 : listKH) {
								// gửi lại phản hồi cho Client
								if (kh1.cauhoi.contains(choice1)) {
									message += kh1.toString() + "\n";
								} else {
									message += "Khong tim thấy câu hỏi";
								}
								dos.writeUTF(message);
							}
						
					}

				}
				if (k == 2) {
					dos.writeUTF("Cam on ban da su dung chuong trinh");	
					break;
				}
				//kết thức thread nãy khởi tạo
			}
		} catch (IOException ex) {
			System.out.println("Nhap sai");
			Logger.getLogger(ChatServer.class.getName()).log(Level.SEVERE, null, ex);
}
	}
}
