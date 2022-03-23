package fis.topic02.practice01;

import java.util.*;

public class SinhVien {
  private String mssv;
  private String ten;

  private Set<Diem> monDaHoc = new HashSet<Diem>();

  public SinhVien() {
	super();
}

  public SinhVien(String mssv, String ten) {
	this.mssv = mssv;
	this.ten = ten;
}

  public String getMssv() {
	return mssv;
  }

  public void setMssv(String mssv) {
	this.mssv = mssv;
  }

  public String getTen() {
	return ten;
  }

  public void setTen(String ten) {
	this.ten = ten;
  }

  public boolean themDiem(Diem diemMoi){
    return this.monDaHoc.add(diemMoi);
  }

  //Cau 1
  public double tinhDiemTrungBinh(){
    //Giong nhu cach tinh hien tai cua truong
	OptionalDouble diemTB;
	diemTB = monDaHoc.stream().mapToDouble(t->t.getDiem()).average();
	double check = diemTB.isPresent() ? diemTB.getAsDouble() : 0.0d;
	return check;
  }


  //Cau 2
  public StringBuilder bangDiem(){
	
    /*
     MSSV : 0203044
     Ten  : Nguyen Van A
     Danh Sach Diem
     STT  Ten Mon             Diem       So Tin Chi
     1    Cau Truc Du Lieu 1  8          3
     2    Cau Truc Du Lieu 2  8          3
     Diem Trung Binh   8.0
    */
	  StringBuilder s = new StringBuilder("MSSV: "+this.mssv+"\nTen: "+this.ten+"\n"
			  +String.format("%-3s %-20s %-5s %-10s")+"\n");
	  for(Diem diem:monDaHoc) {
		  int i=0;
		  int tc=diem.getMon().getTcLT()+diem.getMon().getTcTH();
		  i++;
		  s.append(String.format("%-3s %-20s %-5s %-10s", i, diem.getMon().getTen(),diem.getDiem(),tc+"\n"));
	  }
	  return s.append(false);
  }


  //Cau 3
  public String xepLoai(){
    /*
    Quy tac xep loai nhu sau
        DiemTB < 5 -> YEU
        DiemTB >= 5 va DiemTB < 6 -> TB
        DiemTB >= 6 va DiemTB < 7 -> TB-KHA
        DiemTB >= 7 va DiemTB < 8 -> KHA
        DiemTB >= 8 -> GIOI
    */

    //...
	  String pr = "";
	  double rank = tinhDiemTrungBinh();
	  if(rank<5) {
		  return "YEU";
	  }else if(rank>=5 && rank<6) {
		  return "TB";
	  }else if(rank>=6 && rank<7) {
		  return "TB-KHA";
	  }else if(rank>=7 && rank<8) {
		  return "KHA";
	  }else {
		  return "GIOI";
	  }

  }
}
