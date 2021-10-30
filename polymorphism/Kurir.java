public class Kurir extends Pegawai{
	protected int bonus;
	
	public Kurir(int gaji, int bonus){
		this.gaji = gaji;
		this.bonus = bonus;
	}
	
	int tampilData(){
		int total = gaji + this.bonus;
		return total;
	}
}
