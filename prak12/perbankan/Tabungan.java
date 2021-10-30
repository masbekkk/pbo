package perbankan;

  public class Tabungan {
    protected int saldo;

    public Tabungan(int saldo) {
      this.saldo = saldo;
    }
    

    public int getSaldo() {
    	return this.saldo;
    }

    public void simpanUang(int jumlah) {
    
    	this.saldo = this.saldo + jumlah;

    }

    public boolean ambilUang(int jumlah) {
    	if(jumlah > this.saldo)
    		return false;
    	else
    		this.saldo-=jumlah;
    		return true;

    }
  }

 
