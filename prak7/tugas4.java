import java.util.Scanner;
class tugas4 {
  public String kalimat1, kalimat2, temp1, temp2;

  public void input(String input, String input2) {
    kalimat1 = input;
    kalimat2 = input2;

    temp1 = kalimat1.split(" ")[1];
    temp2 = kalimat2.split(" ")[1];
  }

  public String ganti1() {
    String hasil1 = kalimat1.replace(temp1, temp2);
    return hasil1;
  }

  public String ganti2() {
    String hasil2 = kalimat2.replace(temp2, temp1);
    return hasil2;
  }

  public static void main(String args[]) {
    char pilih = 'y';
    while (pilih == 'y') {
      Scanner string1 = new Scanner(System.in);
      System.out.print("\nMasukkan Kalimat pertama : ");
      String str1 = string1.nextLine();
      Scanner string2 = new Scanner(System.in);
      System.out.print("\nMasukkan Kalimat kedua : ");
      String str2 = string2.nextLine();
      tugas4 obj = new tugas4();
      obj.input(str1, str2);
      System.out.println("Kalimat pertama diubah menjadi : " + obj.ganti1());
      System.out.println("Kalimat kedua diubah menjadi : " + obj.ganti2());
      System.out.println("\n----------------------------------------------\n");
      Scanner pil = new Scanner(System.in);
      System.out.print("Apakah ingin memasukkan kalimat lain ? (y / n) : ");
      pilih = pil.next().charAt(0);
    }
  }
}
