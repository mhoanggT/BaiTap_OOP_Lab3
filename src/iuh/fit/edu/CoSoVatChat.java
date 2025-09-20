/**
 * @description lop nay cho biet thong tin ve CoSoVatChat
 * @author Thai Minh Hoang
 * @version 1.0
 * @created 20/09/2025
 */
package iuh.fit.edu;

abstract class CoSoVatChat {
	protected String ma;
	protected ChatLieu chatlieu;
	protected KichCo kichco;
	protected int soChan;
	
	abstract double canNang();
	
	public CoSoVatChat() {
	}

	public CoSoVatChat(String ma, ChatLieu chatlieu, KichCo kichco, int soChan) {
		setMa(ma);
		setChatlieu(chatlieu);
		setKichco(kichco);
		setSoChan(soChan);
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		if(ma == null || ma.isEmpty()) {
			throw new IllegalArgumentException("ma khong duoc de trong");
		}
		this.ma = ma;
	}

	public KichCo getKichco() {
		return kichco;
	}

	public void setKichco(KichCo kichco) {
		if(!(kichco instanceof KichCo)) {
			throw new IllegalArgumentException("kich co khong phu hop");
		}
		this.kichco = kichco;
	}

	public ChatLieu getChatlieu() {
		return chatlieu;
	}

	public void setChatlieu(ChatLieu chatlieu) {
		if(!(chatlieu instanceof ChatLieu)) {
			throw new IllegalArgumentException("chat lieu khong phu hop");
		}
		this.chatlieu = chatlieu;
	}

	public int getSoChan() {
		return soChan;
	}

	public void setSoChan(int soChan) {
		if(soChan <= 0) {
			throw new IllegalArgumentException("so chan khong hop le");
		}
		this.soChan = soChan;
	}
}
