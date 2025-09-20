package iuh.fit.edu;

public class Ban extends CoSoVatChat {
	private double doRong;
	private double doDai;
	
	public Ban() {
	}

	public Ban(double doRong, double doDai) {
		setDoRong(doRong);
		setDoDai(doDai);
	}

	public double getDoRong() {
		return doRong;
	}

	public void setDoRong(double doRong) {
		if(doRong <= 0) {
			throw new IllegalArgumentException("do rong phai lon hon 0");
		}
		this.doRong = doRong;
	}

	public double getDoDai() {
		return doDai;
	}

	public void setDoDai(double doDai) {
		if(doDai <= 0) {
			throw new IllegalArgumentException("do dai phai lon hon 0");
		}
		this.doDai = doDai;
	}
	
	public double canNang() {
		return getSoChan() * 10 + doRong * doDai * 10;
	}	
}