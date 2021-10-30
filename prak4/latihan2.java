import java.util.*;
class latihan2 {
  public int input;

  public latihan2(int bil) {
    input = bil;
  }

  public int vbalok() {
    int hasil = (int) Math.pow(input, 3);
    return hasil;
  }

  public static void main(String args[]) {

    char pilih = 'y';
    while (pilih == 'y') {
      Scanner bil = new Scanner(System.in);
      System.out.print("\nMasukkan angka yang sama untuk tinggi, lebar, dan panjang balok : ");
      int temp = bil.nextInt();
      latihan2 vbalok = new latihan2(temp);
      System.out.println("Volume balok untuk " + temp + " adalah : " + vbalok.vbalok());
      Scanner pil = new Scanner(System.in);
      System.out.print("Apakah ingin memasukkan angka lain ? (y / n) : ");
      pilih = pil.next().charAt(0);
      //System.out.print(pilih);
    }

  }
}
