import java.util.Scanner;

public class TesLatihan4 {
  public static void Proses(Pegawai employee) {
    if (employee instanceof Manajer) {

      System.out.println("Total Pendapatan Manajer adalah " + ((Manajer) employee).tampilData());
    } else if (employee instanceof Kurir) {

      System.out.println("Total Pendapatan Kurir adalah " + ((Kurir) employee).tampilData());
    }
  }

  public static void main(String args[]) {
    char pilih = 'y';
    TesLatihan4 emp = new TesLatihan4();
    while (pilih == 'y') {
      Scanner menu = new Scanner(System.in);
      System.out.print("\nHalo, apakah anda ingin menggaji \n1. Manajer\n2. Kurir\nMasukkan Opsi (1/2) : ");
      int opsi = menu.nextInt();
      switch (opsi) {
      case 1:

        Scanner m_gaji = new Scanner(System.in);
        System.out.print("\nMasukkan Gaji Manajer : ");
        int temp3 = m_gaji.nextInt();
        Scanner tunjangan = new Scanner(System.in);
        System.out.print("\nMasukkan Tunjangan Manajer : ");
        int in_tunjangan = tunjangan.nextInt();
        Manajer manajer = new Manajer(temp3, in_tunjangan);
        emp.Proses(manajer);
        break;

      case 2:
        Scanner gaji = new Scanner(System.in);
        System.out.print("\nMasukkan Gaji Kurir: ");
        int temp = gaji.nextInt();
        Scanner bonus = new Scanner(System.in);
        System.out.print("\nMasukkan Bonus Kurir: ");
        int temp2 = bonus.nextInt();
        Kurir kurir = new Kurir(temp, temp2);
        emp.Proses(kurir);

        break;
      }
      System.out.println("\n----------------------------------------------\n");
      Scanner pil = new Scanner(System.in);
      System.out.print("Apakah ingin memasukkan menu lain ? (y / n) : ");
      pilih = pil.next().charAt(0);

    }
  }
}
