import java.util.*;
class tugas2 {
  public int tahun;

  public tugas2(int input) {
    tahun = input;
  }

  public int cekKabisat() {
    while ((tahun >= 1900) && (tahun <= 2005)) {
      if (tahun % 4 == 0) {
        return tahun;
      } else {
        return 1;
      }
    }
    return 0;

  }

  public static void main(String args[]) {
    char pilih = 'y';
    while (pilih == 'y') {
      Scanner thn = new Scanner(System.in);
      System.out.print("\nMasukkan Tahun : ");
      int temp = thn.nextInt();
      tugas2 bil = new tugas2(temp);
      int hasil = bil.cekKabisat();
      if (hasil == 1) {
        System.out.print(bil.tahun + " bukan kabisat\n");
      } else if (hasil == 0) {
        System.out.print(bil.tahun + " melebihi batas dari 1900 - 2005\n");
      } else {
        System.out.print(hasil + " adalah kabisat\n");
      }
      Scanner pil = new Scanner(System.in);
      System.out.print("Apakah ingin memasukkan tahun lain ? (y / n) : ");
      pilih = pil.next().charAt(0);
    }
  }
}
