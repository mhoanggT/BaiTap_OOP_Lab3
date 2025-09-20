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