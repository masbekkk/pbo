package perbankan;

public class PengambilanUang extends Tabungan {
  protected int proteksi;

  public PengambilanUang(int saldo) {
    super(saldo);
  }

  public PengambilanUang(int saldo, int proteksi) {
    super(saldo);
    this.proteksi = proteksi;
  }

  public int getSaldo() {
    return this.saldo;
  }

  public boolean ambilUang(int jumlah) {
    int temp = this.saldo - this.proteksi;
    if (jumlah > temp)
      return false;
    else
      this.saldo -= jumlah;
    return true;

  }
}
