import java.util.Scanner;
public class TesMultiTabungan {
  public static void main(String args[]) {
    char pilih = 'y';
    int saldo = 0;
    while (pilih == 'y') {
      Scanner menu = new Scanner(System.in);
      System.out.print("\nSelamat datang, kami menyediakan menu transaksi sebagai berikut \n1. Simpan Uang \n2. AmbilUang \n");
      System.out.print("Silahkan masukkan nomor menu (1/2) ? ");
      int opsi = menu.nextInt();
      switch (opsi) {
      case 1:

        Scanner string = new Scanner(System.in);
        System.out.print("\nHai, kamu ingin menyimpan mata uang mana yang kamu gunakan? (USD/AUD/IDR) : ");
        String temp = string.nextLine();
        Scanner jml = new Scanner(System.in);
        System.out.print("\nBaik, silahkan masukkan nominal uang yang Anda simpan : ");
        int uang = jml.nextInt();
        MultiTabungan matauang = new MultiTabungan(uang);
        if (temp.equalsIgnoreCase("USD")) {
          System.out.print("\nBaik, Terima Kasih, Mata uang anda " + temp + " akan kami konversikan ke IDR, Sehingga saldo anda sekarang adalah : " + matauang.simpanUSD() + " IDR");

          saldo = matauang.getSaldo();

        } else if (temp.equalsIgnoreCase("AUD")) {
          System.out.print("\nBaik, Terima Kasih, Mata uang anda " + temp + " akan kami konversikan ke IDR, Sehingga saldo anda sekarang adalah : " + matauang.simpanAUD() + " IDR");

          saldo = matauang.getSaldo();

        } else {
          System.out.print("\nBaik, Terima Kasih, Mata uang anda " + temp + " akan kami konversikan ke IDR, Sehingga saldo anda sekarang adalah : " + matauang.getSaldo() + " IDR");

          saldo = matauang.getSaldo();
        }
        System.out.println("\n----------------------------------------------\n");
        break;
      case 2:
        MultiTabungan tarik = new MultiTabungan(saldo);
        System.out.println("Saldo awal : " + tarik.getSaldo());
        Scanner str = new Scanner(System.in);
        System.out.print("\nHai, kamu ingin tarik tunai dengan mata uang mana yang kamu gunakan? (USD/AUD/IDR) : ");
        String satuan = str.nextLine();
        Scanner jumlah = new Scanner(System.in);
        System.out.print("\nBaik, silahkan masukkan nominal uang yang Anda tarik : ");
        int ambil = jumlah.nextInt();
        if (satuan.equalsIgnoreCase("USD")) {
          if (tarik.ambilUangUSD(ambil)){
            System.out.print("\nBaik, Terima Kasih, Anda sudah berhasil melakukan penarikan sebesar " + ambil + " USD Sehingga saldo anda sekarang adalah : " + tarik.getSaldo() + " IDR");
            saldo = tarik.getSaldo();
          }else
            System.out.print("\nMohon maaf Saldo anda tidak mencukupi, Terima Kasih.");
        } else if (satuan.equalsIgnoreCase("AUD")) {
          if (tarik.ambilUangAUD(ambil)){
            System.out.print("\nBaik, Terima Kasih, Anda sudah berhasil melakukan penarikan sebesar " + ambil + " AUD Sehingga saldo anda sekarang adalah : " + tarik.getSaldo() + " IDR");
            saldo = tarik.getSaldo();
          }else
            System.out.print("\nMohon maaf Saldo anda tidak mencukupi, Terima Kasih.");

        } else {
          if (tarik.ambilUang(ambil)){
            System.out.print("\nBaik, Terima Kasih, Anda sudah berhasil melakukan penarikan sebesar " + ambil + " IDR Sehingga saldo anda sekarang adalah : " + tarik.getSaldo() + " IDR");
            saldo = tarik.getSaldo();
          }else
            System.out.print("\nMohon maaf Saldo anda tidak mencukupi, Terima Kasih.");
        }
        System.out.println("\n----------------------------------------------\n");
        break;
      }
      Scanner pil = new Scanner(System.in);
      System.out.print("Terima Kasih, Apakah ingin memasukkan transaksi lain ? (y / n) : ");
      pilih = pil.next().charAt(0);
    }
  }
}
