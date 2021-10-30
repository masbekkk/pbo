package perbankan;

public class Bank{
	private Nasabah[] nasabah;
	private int jumlahNasabah;
	
	public Bank(){
		nasabah = new Nasabah[4];
		this.jumlahNasabah = 0;
	}
	
	public void tambahNasabah(String namaAwal, String namaAkhir){
		int i = jumlahNasabah++;
		nasabah[i] = new Nasabah(namaAwal, namaAkhir);
	}
	
	public int getJumlahNasabah(){
		return this.jumlahNasabah;
	}
	
	public Nasabah getNasabah(int indeks){
		return this.nasabah[indeks];
	}
}
