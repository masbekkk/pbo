class Kalender {
  private int tanggal = 1, bulan = 1, tahun = 2000;

  Kalender(int tanggal) {
    this.tanggal = tanggal;
  }

  Kalender(int bulan, int tahun) {
    this.bulan = bulan;
    this.tahun = tahun;
  }

  Kalender(int tanggal, int bulan, int tahun) {
    this.tanggal = tanggal;
    this.bulan = bulan;
    this.tahun = tahun;
  }

  void setTanggal(int tanggal) {
    this.tanggal = tanggal;
  }

  void setBulan(int bulan) {
    this.bulan = bulan;
  }

  void setTahun(int tahun) {
    this.tahun = tahun;
  }

  int getTanggal() {
    return this.tanggal;
  }

  int getBulan() {
    return this.bulan;
  }

  int getTahun() {
    return this.tahun;
  }

}
