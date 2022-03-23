package fis.topic03.practice02;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ChatClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 2811);
            DataInputStream dis = new DataInputStream(socket.getInputStream());
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            //xuly
            Scanner sc = new Scanner(System.in);
            int k = 0;
            String message = "";
            
//                System.out.println("Xin chào Bạn! Mùa hè đến rồi bạn đã chuẩn bị gì cho 1 chuyến đi du lịch chưa?");
//                System.out.println("1. Tiếp tục");
//                System.out.println("2. Ket thuc");
//                System.out.print("Moi ban nhap lựa chọn (1 hay 2): ");
//                k = Integer.parseInt(sc.nextLine());
//                dos.writeUTF(String.valueOf(k));
//            	dis.readUTF(message); nhận ->thread{
            	//
//                while (k != 2) {
                	if (k==1) {
                	String messenger="";
                    System.out.println("\nNhap tin: ");
                    messenger = sc.nextLine();
                    dos.writeUTF(messenger);
                    while (true) {
                        if (messenger.equals("tam biet")) {
                            dos.writeUTF(messenger);
                        } else {
                            //nhận mess phản hồi từ Server 
                            System.out.println("Server: " + dis.readUTF()+"\n");
                            messenger = new Scanner(System.in).nextLine();

                            //gửi mess cho Server
                            System.out.println("\nNhap tin: ");
                            messenger = sc.nextLine();
                            dos.writeUTF(messenger);
                        }
                    }
                }else if(k==2) {
                	//
                	dis.readUTF(message);
                        break;
                }else {
                        System.out.println("Nhap sai");
                }
            }
        } catch (IOException ex) {
            Logger.getLogger(ChatClient.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

//Sửa
//public static void main(String[] args) {
//    try {
//        Socket socket = new Socket("localhost", 2811);
//        onReceived(socket);
//        onSend(socket);
//        } catch (IOException ex) {
//            Logger.getLogger(ChatClient.class.getName()).log(Level.SEVERE, null, ex);
//        }
//    }
//}
//public static void onReceived(Socket socket){
//    DataInputStream dis = new DataInputStream(socket.getInputStream());
//    Thread t = new Thread(new Runnable() {
//        @Override
//        public void run() {
//            String message = "";
//            while (true) {
//                dis.readUTF(message);//cho den khi Server gui msg
//                System.out.println(message);
//            }
//        }
//    });
//    t.start();
//}
//public static void onSend(Socket socket){
//    DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
//    //xuly
//    Scanner sc = new Scanner(System.in);
//    Thread t = new Thread(new Runnable() {
//        String input = "1";
//        @Override
//        public void run() {
//            while (!"2".equals(input)){
//                System.out.println("\nNhap tin: ");
//                input = sc.nextLine();
//                dos.writeUTF(input);
//            }
//        }
//    });
//    t.start();
//}
