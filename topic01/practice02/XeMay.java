package fis.topic01.practice02;

public class XeMay extends Xe{
	private String soXe;
	

	public XeMay(String soXe) {
		super();
		this.soXe = soXe;
	}


	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return Constant.PRICE.XE_MAY;
	}
	
}
