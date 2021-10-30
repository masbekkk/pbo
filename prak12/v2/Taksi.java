public class Taksi extends Mobil{
	private int TarifAwal, TarifPerKm;
	
	void setTarifAwal(int ta){	
		this.TarifAwal = ta;
	}
	
	int getTarifAwal(){
		return this.TarifAwal;
	}
	
	void setTarifPerKm(int tp){
		this.TarifPerKm = tp;
	}
	
	int getTarifPerKm(){
		return this.TarifPerKm;
	}
}
