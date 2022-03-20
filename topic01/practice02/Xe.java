package fis.topic01.practice02;

public abstract class Xe {
	protected int soPhieu;
	protected double price;
	abstract double getPrice();
	public Xe() {
		super();
	}
	
	public Xe(int soPhieu) {
		super();
		this.soPhieu = soPhieu;
	}

	
	
	public void setPrice(double price) {
		this.price = price;
	}
	

}
