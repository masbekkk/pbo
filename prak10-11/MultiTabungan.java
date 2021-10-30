class MultiTabungan {
  private int saldo;

  MultiTabungan(int initsaldo) {
    this.saldo = initsaldo;
  }

  int getSaldo() {
    return this.saldo;
  }

  int simpanUang(int jumlah) {
    return this.saldo += jumlah;
  }

  boolean ambilUang(int jumlah) {
    if (saldo > jumlah) {
      this.saldo -= jumlah;
      return true;
    } else {
      return false;
    }

  }

  int simpanAUD() {
    return this.saldo *= 10000;
  }

  boolean ambilUangAUD(int jumlah) {
    jumlah *= 10000;
    //int idr = jumlah * 10000;
    if (this.saldo > jumlah) {
      this.saldo -= jumlah;
      return true;
    } else {
      return false;
    }

  }

  int simpanUSD() {
    return this.saldo *= 9000;
  }

  boolean ambilUangUSD(int jumlah) {
    jumlah *= 9000;
    //int idr = jumlah * 9000;
    if (this.saldo > jumlah) {
      this.saldo -= jumlah;
      return true;
    } else {
      return false;
    }

  }
}
