class Truk {
  private double muatan, muatanmaks;

  Truk(double beratmaks) {
    this.muatanmaks = beratmaks;
  }

  double getMuatan() {
    return this.muatan;
  }

  double getMuatanMaks() {
    return this.muatanmaks;
  }

  boolean tambahMuatan(double berat) {
    double temp = this.muatan + berat;
    if (temp > this.muatanmaks) {
      return false;
    } else {
      this.muatan = this.muatan + berat;
      return true;
    }
  }

  double newtsToKilo(double berat) {

    double hasil = berat / 9.8;
    return hasil;

  }

  double kiloToNewts(double berat) {

    double hasil = berat * 9.8;
    return hasil;

  }
}
