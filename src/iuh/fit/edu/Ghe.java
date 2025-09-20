/**
 * @description lop nay cho biet thong tin ve ghe va ke thua tu CoSoVatChat
 * @author Thai Minh Hoang
 * @version 1.0
 * @created 20/09/2025
 */
package iuh.fit.edu;

public class Ghe extends CoSoVatChat{
	private boolean coTuaGhe;
	
	public Ghe (String ma, ChatLieu chatLieu, KichCo kichCo, int SoChan, boolean coTuaGhe) {
		this.coTuaGhe = coTuaGhe;
	}

	@Override
	public double canNang() {
		int nangNangCuaTuaGhe = coTuaGhe ? 20 : 0;
		return soChan * 10 + nangNangCuaTuaGhe;
	}
}