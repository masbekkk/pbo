public class Pegawai{
	protected int gaji;
	protected String nama;
	
	protected Pegawai(String nama, int gaji){	
		this.nama = nama;
		this.gaji = gaji;
	}
	
	protected int infoGaji(){
		return this.gaji;
	}
}
