import java.util.Scanner;
class tugas3 {
  public String str;

  public void input(String input) {
    str = input;
  }

  public char[] ubah() {
    int max = str.length() - 1;
    String kapital = str.toUpperCase();
    String kecil = str.toLowerCase();
    char kalimat[] = str.toCharArray();
    char hurufBesar[] = kapital.toCharArray();
    char hurufKecil[] = kecil.toCharArray();
    char first = hurufKecil[0];
    char firstKap = hurufBesar[0];
    char end = hurufKecil[max];
    char endKap = hurufBesar[max];
    for (int i = 0; i <= max; i++) {
      if (kalimat[i] == firstKap) kalimat[i] = endKap;
      if (kalimat[i] == first) kalimat[i] = end;

    }
    kalimat[max] = first;
    return kalimat;

  }

  public static void main(String args[]) {
    char pilih = 'y';
    while (pilih == 'y') {
      Scanner string = new Scanner(System.in);
      System.out.print("\nMasukkan Kalimatmu : ");
      String temp = string.nextLine();
      tugas3 tulisan = new tugas3();
      tulisan.input(temp);
      System.out.print("Kalimat Anda adalah : " + temp + "\nKemudian diubah menjadi : ");
      System.out.print(tulisan.ubah());
      System.out.println("\n----------------------------------------------\n");
      Scanner pil = new Scanner(System.in);
      System.out.print("Apakah ingin memasukkan kalimat lain ? (y / n) : ");
      pilih = pil.next().charAt(0);
    }
  }
}
