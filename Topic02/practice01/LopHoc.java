package fis.topic02.practice01;

import java.util.*;
import java.util.stream.Collectors;

public class LopHoc {
  private String ten;
  private String giaoVien;
  private List<SinhVien> dsLop = new ArrayList<SinhVien>();

  
  public LopHoc() {
	super();
}

  public String getTen() {
	return ten;
  }

  public void setTen(String ten) {
	this.ten = ten;
}

  public String getGiaoVien() {
	return giaoVien;
}

  public void setGiaoVien(String giaoVien) {
	this.giaoVien = giaoVien;
}

  public LopHoc(String ten, String giaoVien){
    this.ten = ten;
    this.giaoVien = giaoVien;
  }

  public boolean them(SinhVien svMoi){
    return dsLop.add(svMoi);
  }

  //Cau 4
  public String inDiem(){
	return giaoVien;
    /*
    Danh Sach Diem Lop : ten
    Giao Vien Chu Nhiem : giaoVien
    STT      MSSV        Ten              Diem TB   XepLoai
    1        123456      Nguyen Van A     8.4       GIOI
    2        678919      Nguyen Van B     6         TB-KHA
    3        112456      Nguyen Van C     7         KHA
    */
	  
  }

  //Cau 5
  public List<SinhVien> top10(){
    //Tra ve danh sach 10 sinh vien co diem trung binh lon nhat lop
	  List<SinhVien> top10;
	  top10 = dsLop.stream()
			  		.sorted(Comparator.comparingDouble(SinhVien::tinhDiemTrungBinh).reversed())
			  		.limit(10)
			  		.toList();
	  return top10;
  }

  //Cau 6
  public List<SinhVien> sinhVienYeu(){
    //Tra ve danh sach vien vien xep loai YEU
	  List<SinhVien> sinhVienYeu;
	  sinhVienYeu = dsLop.stream()
			  		.filter(t ->t.xepLoai().startsWith("YEU") )
			  		.collect(Collectors.toList());
	  return sinhVienYeu;
  }
}
