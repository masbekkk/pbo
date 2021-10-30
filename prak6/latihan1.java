class latihan1 {
  public String nama;
  public int rpl, bd, pbo;

  public latihan1(String name, int n1, int n2, int n3) {
    nama = name;
    rpl = n1;
    bd = n2;
    pbo = n3;
  }

  public double getAvg() {
    double hasil = (double)(rpl + bd + pbo) / 3;
    return hasil;
  }

  public static void main(String args[]) {

    latihan1 nilai[] = new latihan1[4];

    nilai[0] = new latihan1("Ahmad", 81, 90, 62);
    nilai[1] = new latihan1("Adang", 50, 83, 87);
    nilai[2] = new latihan1("Dani", 89, 55, 65);
    nilai[3] = new latihan1("Edi", 77, 70, 92);

    System.out.println("NRP\tNama\tRata-rata");
    System.out.println("========================");
    for (int i = 0; i <= nilai.length - 1; i++) {
      System.out.println(i + 1 + "\t" + nilai[i].nama + "\t" + String.format("%.2f", nilai[i].getAvg()));
    }
    System.out.println("========================");
  }
}
