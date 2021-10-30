import java.util.Scanner;
class TesTugas2 {
  int umur1, umur2, panjangekor;
  String nama1, nama2;
  public static void main(String args[]) {
    TesTugas2 obj = new TesTugas2();
    obj.setNilai();
    
  }

  void setNilai() {
    char pilih = 'y';
    while (pilih == 'y') {
      Scanner item1 = new Scanner(System.in);
      System.out.print("Masukkan Umur pada Katak : ");
      umur1 = item1.nextInt();

      Scanner item2 = new Scanner(System.in);
      System.out.print("Masukkan Nama pada Katak : ");
      nama1 = item2.nextLine();
      Katak katak = new Katak(umur1, nama1);
      
      Scanner item3 = new Scanner(System.in);
      System.out.print("Masukkan Umur pada Kecebong : ");
      umur2 = item3.nextInt();

      Scanner item4 = new Scanner(System.in);
      System.out.print("Masukkan Nama pada Kecebong : ");
      nama2 = item4.nextLine();

      Scanner item5 = new Scanner(System.in);
      System.out.print("Masukkan Panjang ekor pada Kecebong : ");
      panjangekor = item5.nextInt();

      Katak kecebong = new Kecebong(umur2, nama2, panjangekor);
      System.out.println("\n----------------------------------------------\n");
      
    //System.out.println("\tObjek|Umur|Nama|Panjang Ekor|Cara Bergerak|");
    System.out.println("\n---------------------------------------------- \n");
    System.out.println("Object : Katak   \nUmur : " + umur1 + "\nNama : " + nama1 + "\nPanjang Ekor : -\nCara Bergerak : " + katak.caraBergerak());

    System.out.println("\n-------------------------------------------------------------------------------------------------------\n");
    System.out.println("Object : Kecebong   \nUmur : " + umur2 + "\nNama : " + nama2 + "\nPanjang Ekor : " + panjangekor + "\nCara Bergerak : " + kecebong.caraBergerak());
      
      System.out.println("\n----------------------------------------------\n");
      Scanner pil = new Scanner(System.in);
      System.out.print("Apakah ingin memasukkan inputan baru? (y / n) : ");
      pilih = pil.next().charAt(0);

    }
  }
}
