package fis.topic01.practice01;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentList stuList = new StudentList();
		int choice = 0;
		do {
			System.out.println("\t------MENU-----");
			System.out.println("" 
					+ "\t1. Thêm sinh viên.\n " 
					+ "\t2. Xóa sinh viên.\n "
					+ "\t3. Hiển thị danh sách.\n" 
					+ "\t4. Sắp xếp theo mã sinh viên.\n"
					+ "\t0. Thoát");
			System.out.println("Mời bạn chọn: ");
			choice = sc.nextInt();
			sc.nextLine();
			if (choice == 1) {
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy");
				Date birthDate = null;
				System.out.println("Mã sinh viên: ");
				int code = sc.nextInt();
				sc.nextLine();
				System.out.println("Tên sinh viên: ");
				String name = sc.nextLine();
				try {
					System.out.println("Ngày sinh: ");
					birthDate = dateFormat.parse(sc.nextLine());
				} catch (ParseException e) {
					e.printStackTrace();
				}
				Student student = new Student(code, name, birthDate);
				stuList.addStudent(student);

			} else if (choice == 2) {
				System.out.println("Mã sinh viên: ");
				int code = sc.nextInt();
				Student student = new Student(code);
				System.out.println("Xóa sinh viên: "+stuList.removeStudent(student));
				
			} else if (choice == 3) {
				stuList.display();
			} else if (choice == 4) {
				stuList.sort();
				stuList.display();
			}
		} while (choice != 0);

	}
}
