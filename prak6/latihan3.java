import java.util.Scanner;
public class latihan3 {
  int bil, cek = 0;
  
  public latihan3(int input) {
    bil = input;
  }

  public int cekprima() {
    for (int i = 2; i <= bil; i++) {
      if (bil % i == 0) {
        cek++;
      }
    }
    if (cek == 1) {
      return 1;
    } else {
      return 0;
    }
  }

  public static void main(String args[]) {
    char pilih = 'y';
    int i = 1;
    while (pilih == 'y') {
      Scanner input = new Scanner(System.in);
      System.out.print("Masukan Angka : ");
      int temp = input.nextInt();
      i++;
      latihan3 bilangan[] = new latihan3[i+1];
      bilangan[i-1] = new latihan3(temp);
      int hasil = bilangan[i-1].cekprima();
      if (hasil == 1)
        System.out.println(bilangan[i-1].bil + " adalah bilangan prima");
      else
        System.out.println(bilangan[i-1].bil + " bukan bilangan prima");
      System.out.println("----------------------------------------------");
      Scanner pil = new Scanner(System.in);
      System.out.print("Apakah ingin memasukkan bilangan lain ? (y / n) : ");
      pilih = pil.next().charAt(0);
    }
  }
}
