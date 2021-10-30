public class Manajer extends Pegawai{
	protected int tunjangan;
	
	public Manajer(int gaji, int tunjangan){
		this.gaji = gaji;
		this.tunjangan = tunjangan;
	}
	
	int tampilData(){
		int total = gaji + this.tunjangan;
		return total;
	}
}
