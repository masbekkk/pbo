import java.util.Scanner;
class tugas5 {
  public String kalimat;

  public void input(String input) {
    kalimat = input;
  }

  public String replaceWith(String awal, String ganti) {
    String hasil = kalimat.replace(awal, ganti);

    return hasil;
  }

  public static void main(String args[]) {
    char pilih = 'y';
    while (pilih == 'y') {
      Scanner string = new Scanner(System.in);
      System.out.print("\nMasukkan Kalimat : ");
      String str = string.nextLine();
      tugas5 obj = new tugas5();
      obj.input(str);
      Scanner string2 = new Scanner(System.in);
      System.out.print("\nMasukkan Kata yang ingin diganti : ");
      String str2 = string2.nextLine();

      String awal = str2;
      Scanner string3 = new Scanner(System.in);
      System.out.print("\nMasukkan Kata pengganti : ");
      String str3 = string3.nextLine();
      String ganti = str3;
      System.out.println("Kalimat yang Anda masukkan : " + obj.kalimat + "\nKata yang diganti : " +
        awal + "\nKata Pengganti : " + ganti + "\nKalimat Anda menjadi : " + obj.replaceWith(awal, ganti));
      System.out.println("\n----------------------------------------------\n");
      Scanner pil = new Scanner(System.in);
      System.out.print("Apakah ingin memasukkan kalimat lain ? (y / n) : ");
      pilih = pil.next().charAt(0);
    }
  }
}
