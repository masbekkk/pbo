public class TesLatihan1 {
  public static void main(String args[]) {
    TabunganNo1 tabungan = new TabunganNo1(5000);
    System.out.println("Saldo awal : " + tabungan.saldo);
    tabungan.ambilUang(2300);
    System.out.println("Jumlah uang yang diambil : 2300");
    System.out.println("Saldo sekarang : " + tabungan.saldo);
  }
}
