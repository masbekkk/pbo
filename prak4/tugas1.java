import java.util.*;
class tugas1 {
  public double bil;

  public tugas1(double input) {
    bil = input;
  }

  public double vbola() {
    double hasil = (double) 3.14159 * 1.333333333 * Math.pow(bil, 3);
    return hasil;
  }

  public static void main(String args[]) {
    char pilih = 'y';
    while (pilih == 'y') {
      Scanner bil = new Scanner(System.in);
      System.out.print("\nMasukkan jari-jari bola : ");
      double temp = bil.nextDouble();
      tugas1 vbola = new tugas1(temp);
      System.out.println("Volume bola untuk jari-jari " + temp + " adalah : " + String.format("%.2f", vbola.vbola()));
      Scanner pil = new Scanner(System.in);
      System.out.print("Apakah ingin memasukkan jari-jari lain ? (y / n) : ");
      pilih = pil.next().charAt(0);
    }
  }
}
