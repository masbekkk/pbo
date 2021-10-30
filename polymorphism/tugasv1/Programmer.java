public class Programmer extends Pegawai{
	protected int bonus;
	
	public Programmer(String nama, int gaji, int bonus){
		super(nama, gaji);
		this.bonus = bonus;
	}
	
	protected int infoGaji(){
		return this.gaji;
	}
	
	int infoBonus(){
		return this.bonus;
		
	}
}
