public class Manajer extends Pegawai{
	protected int tunjangan;
	
	Manajer(String nama, int gaji, int tunjangan){
		super(nama, gaji);
		this.tunjangan = tunjangan;
	}
	
	protected int infoGaji(){
		return this.gaji;
	}
	
	int infoTunjangan(){
		return this.tunjangan;
		
	}
}
