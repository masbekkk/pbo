public class Tabungan{
	public int saldo;
	
	public Tabungan(int initsaldo){
		saldo = initsaldo;
	}
	
	public int getSaldo(){
		return saldo;
	}
	
	public int simpanUang(int jumlah){
		return saldo = saldo + jumlah;
	}
	
	public boolean ambilUang(int jumlah){
		if(saldo > jumlah){
			saldo = saldo - jumlah;
			return true;
		}else{
			return false;
		}
		
	}
}
		
