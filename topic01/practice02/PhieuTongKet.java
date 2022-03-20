package fis.topic01.practice02;

import java.util.ArrayList;
import java.util.List;

public class PhieuTongKet {
	private List<Xe> danhSachXe = new ArrayList<Xe>();
	private double chiPhi;
	
	
	public void addXe() {
		
	}
	
	public int soXe() {
		return this.danhSachXe.size();
	}
	
	public double tienGuiXe() {
		double tongGui=0;
		for(Xe xe: this.danhSachXe) {
			tongGui=xe.getPrice();
		}
		return tongGui;
		
	}
	
	
	public double tienLai() {
		double tienLai=0;
		double chiPhi=0; 	chiPhi=soXe()*100;
		double tienThue=0; 	tienThue=(tienGuiXe()*10)/100;
		return tienLai = tienGuiXe() - (chiPhi+tienThue);
		
	}

}
