import java.util.Scanner;
class tugas1 {
  public char index;
  public String kalimat;

  public void inputString(String input) {
    kalimat = input;
  }

  public void inputChar(char input) {
    index = input;
  }

  public void countIndex() {
    int i = kalimat.indexOf(index);
    System.out.print("Karakter " + index + " terdapat pada index : ");
    while (i >= 0) {
      System.out.print(i + ", ");
      i = kalimat.indexOf(index, i + 1);
    }
  }

  public static void main(String args[]) {
    char pilih = 'y';
    while (pilih == 'y') {
      Scanner string = new Scanner(System.in);
      System.out.print("\nMasukkan Kalimatmu : ");
      String temp = string.nextLine();
      tugas1 tulisan = new tugas1();
      tulisan.inputString(temp);
      System.out.println("Kalimat anda adalah : " + temp);
      Scanner kalimat = new Scanner(System.in);
      System.out.print("\nMasukkan Karakter yang ingin kamu cari indexnya : ");
      char tampung = kalimat.next().charAt(0);
      tulisan.inputChar(tampung);
      tulisan.countIndex();
      System.out.println("\n----------------------------------------------\n");
      Scanner pil = new Scanner(System.in);
      System.out.print("Apakah ingin memasukkan kalimat lain ? (y / n) : ");
      pilih = pil.next().charAt(0);

    }
  }
}
