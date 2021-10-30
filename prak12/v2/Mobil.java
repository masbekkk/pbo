public class Mobil extends Kendaraan{
	private String bahanBakar;
	private int kapasitasMesin;
	
	protected void setBahanBakar(String bhn){
		this.bahanBakar = bhn;
	}
	
	protected String getBahanBakar(){
		return this.bahanBakar;
	}
	
	protected void setKapasitasMesin(int mesin){
		this.kapasitasMesin = mesin;
	}
	
	protected int getKapasitasMesin(){
		return this.kapasitasMesin;
	}
}
