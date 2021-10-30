import java.util.Scanner;
class Tes {

  Truk truk1 = new Truk();
  Truk truk2 = new Truk();
  Taksi taksi1 = new Taksi();
  Taksi taksi2 = new Taksi();
  Sepeda sepeda1 = new Sepeda();
  Sepeda sepeda2 = new Sepeda();
  public static void main(String args[]) {

    Tes tes = new Tes();
    tes.setNilai();
    tes.show();

  }

  void show(){
  	System.out.println("\tObjek|jml Roda|Warna|Bahan Bakar|Kapasitas Mesin|Muatan Maks|Tarif Awal|Tarif per-Km|jml Sadel|jml Gir");
  	System.out.println("\n-------------------------------------------------------------------------------------------------------\n");
  	System.out.println("\tTruk1\t" + truk1.getJmlRoda() + "\t" + truk1.getWarna() + "\t" + truk1.getBahanBakar()  + "\t" + truk1.getKapasitasMesin() + "\t" + truk1.getMuatanMaks() + "\t-\t-\t-\t-");
  	
  	System.out.println("\n-------------------------------------------------------------------------------------------------------\n");
  	System.out.println("\tTruk2\t" + truk2.getJmlRoda() +"\t" + truk2.getWarna() + "\t" + truk2.getBahanBakar() +"\t" + truk2.getKapasitasMesin() + "\t" + truk2.getMuatanMaks() + "\t-\t-\t-\t-");
  	
  	System.out.println("\n-------------------------------------------------------------------------------------------------------\n");
  	System.out.println("\tTaksi1\t" + taksi1.getJmlRoda() +"\t" + taksi1.getWarna() + "\t" + taksi1.getBahanBakar() +"\t" + taksi1.getKapasitasMesin() + "\t-\t" + taksi1.getTarifAwal() + "\t" + taksi1.getTarifPerKm() + "\t-\t-");
  	
  	System.out.println("\n-------------------------------------------------------------------------------------------------------\n");
  	System.out.println("\tTaksi2\t" + taksi2.getJmlRoda() +"\t" + taksi2.getWarna() + "\t" + taksi2.getBahanBakar() +"\t" + taksi2.getKapasitasMesin() + "\t-\t" + taksi2.getTarifAwal() + "\t" + taksi2.getTarifPerKm() + "\t-\t-");
  	
  	System.out.println("\n-------------------------------------------------------------------------------------------------------\n");
  	System.out.println("\tSepeda1\t" + sepeda1.getJmlRoda() +"\t" + sepeda1.getWarna() + "\t-\t-\t-\t-\t- \t"+ sepeda1.getJmlSadel() + "\t" + sepeda1.getJmlGir());
  	
  	System.out.println("\n-------------------------------------------------------------------------------------------------------\n");
  	System.out.println("\tSepeda2\t" + sepeda2.getJmlRoda() +"\t" + sepeda2.getWarna() + "\t-\t-\t-\t-\t- \t"+ sepeda2.getJmlSadel() + "\t" + sepeda2.getJmlGir());
  	
  }
  void setNilai() {
    char pilih = 'y';
    while (pilih == 'y') {
      Scanner item1 = new Scanner(System.in);
      System.out.print("Masukkan Roda pada truk1 : ");
      int roda1 = item1.nextInt();

      truk1.setJmlRoda(roda1);
      Scanner item2 = new Scanner(System.in);
      System.out.print("Masukkan Warna pada truk1 : ");
      String warna1 = item2.nextLine();
      truk1.setWarna(warna1);
      Scanner item3 = new Scanner(System.in);
      System.out.print("Masukkan Jenis Bahan Bakar pada truk1 : ");
      String bbm = item3.nextLine();
      truk1.setBahanBakar(bbm);
      Scanner item4 = new Scanner(System.in);
      System.out.print("Masukkan Kapasitas Mesin pada truk1 : ");
      int kapmesin = item4.nextInt();
      truk1.setKapasitasMesin(kapmesin);
      Scanner item5 = new Scanner(System.in);
      System.out.print("Masukkan Muatan Maks pada truk1 : ");
      int mm = item5.nextInt();
      truk1.setMuatanMaks(mm);
      System.out.println("\n----------------------------------------------\n");
      Scanner item1_2 = new Scanner(System.in);
      System.out.print("Masukkan Roda pada truk2 : ");
      roda1 = item1_2.nextInt();

      truk2.setJmlRoda(roda1);
      Scanner item2_2 = new Scanner(System.in);
      System.out.print("Masukkan Warna pada truk2 : ");
      warna1 = item2_2.nextLine();
      truk2.setWarna(warna1);
      Scanner item3_2 = new Scanner(System.in);
      System.out.print("Masukkan Jenis Bahan Bakar pada truk2 : ");
      bbm = item3_2.nextLine();
      truk2.setBahanBakar(bbm);
      Scanner item4_2 = new Scanner(System.in);
      System.out.print("Masukkan Kapasitas Mesin pada truk2 : ");
      kapmesin = item4_2.nextInt();
      truk2.setKapasitasMesin(kapmesin);
      Scanner item5_2 = new Scanner(System.in);
      System.out.print("Masukkan Muatan Maks pada truk2 : ");
      mm = item5_2.nextInt();
      truk2.setMuatanMaks(mm);
      System.out.println("\n----------------------------------------------\n");

      Scanner item1_3 = new Scanner(System.in);
      System.out.print("Masukkan Roda pada taksi1 : ");
      roda1 = item1_3.nextInt();

      taksi1.setJmlRoda(roda1);
      Scanner item2_3 = new Scanner(System.in);
      System.out.print("Masukkan Warna pada taksi1 : ");
      warna1 = item2_3.nextLine();
      taksi1.setWarna(warna1);
      Scanner item3_3 = new Scanner(System.in);
      System.out.print("Masukkan Jenis Bahan Bakar pada taksi1 : ");
      bbm = item3_3.nextLine();
      taksi1.setBahanBakar(bbm);
      Scanner item4_3 = new Scanner(System.in);
      System.out.print("Masukkan Kapasitas Mesin pada taksi1 : ");
      kapmesin = item4_3.nextInt();
      taksi1.setKapasitasMesin(kapmesin);
      Scanner item5_3 = new Scanner(System.in);
      System.out.print("Masukkan Tarif Awal pada taksi1 : ");
      int ta = item5_3.nextInt();
      taksi1.setTarifAwal(ta);
      Scanner item6_3 = new Scanner(System.in);
      System.out.print("Masukkan Tarif Per-Km pada taksi1 : ");
      int tp = item6_3.nextInt();
      taksi1.setTarifPerKm(tp);
      System.out.println("\n----------------------------------------------\n");

      Scanner item1_4 = new Scanner(System.in);
      System.out.print("Masukkan Roda pada taksi2 : ");
      roda1 = item1_4.nextInt();

      taksi2.setJmlRoda(roda1);
      Scanner item2_4 = new Scanner(System.in);
      System.out.print("Masukkan Warna pada taksi2 : ");
      warna1 = item2_4.nextLine();
      taksi2.setWarna(warna1);
      Scanner item3_4 = new Scanner(System.in);
      System.out.print("Masukkan Jenis Bahan Bakar pada taksi2 : ");
      bbm = item3_4.nextLine();
      taksi2.setBahanBakar(bbm);
      Scanner item4_4 = new Scanner(System.in);
      System.out.print("Masukkan Kapasitas Mesin pada taksi2 : ");
      kapmesin = item4_4.nextInt();
      taksi2.setKapasitasMesin(kapmesin);
      Scanner item5_4 = new Scanner(System.in);
      System.out.print("Masukkan Tarif Awal pada taksi2 : ");
      ta = item5_4.nextInt();
      taksi2.setTarifAwal(ta);
      Scanner item6_4 = new Scanner(System.in);
      System.out.print("Masukkan Tarif Per-Km pada taksi2 : ");
      tp = item6_4.nextInt();
      taksi2.setTarifPerKm(tp);
      System.out.println("\n----------------------------------------------\n");

      Scanner item1_5 = new Scanner(System.in);
      System.out.print("Masukkan Roda pada sepeda1 : ");
      roda1 = item1_5.nextInt();

      sepeda1.setJmlRoda(roda1);
      Scanner item2_5 = new Scanner(System.in);
      System.out.print("Masukkan Warna pada sepeda1 : ");
      warna1 = item2_5.nextLine();
      sepeda1.setWarna(warna1);
      Scanner item3_5 = new Scanner(System.in);
      System.out.print("Masukkan Jumlah Sadel pada sepeda1 : ");
      int sadel = item3_5.nextInt();
      sepeda1.setJmlSadel(sadel);
      Scanner item4_5 = new Scanner(System.in);
      System.out.print("Masukkan Jumlah Gir pada sepeda1 : ");
      int gir = item4_5.nextInt();
      sepeda1.setJmlGir(gir);

      System.out.println("\n----------------------------------------------\n");

      Scanner item1_6 = new Scanner(System.in);
      System.out.print("Masukkan Roda pada sepeda2 : ");
      roda1 = item1_6.nextInt();

      sepeda2.setJmlRoda(roda1);
      Scanner item2_6 = new Scanner(System.in);
      System.out.print("Masukkan Warna pada sepeda2 : ");
      warna1 = item2_6.nextLine();
      sepeda2.setWarna(warna1);
      Scanner item3_6 = new Scanner(System.in);
      System.out.print("Masukkan Jumlah Sadel pada sepeda2 : ");
      sadel = item3_6.nextInt();
      sepeda2.setJmlSadel(sadel);
      Scanner item4_6 = new Scanner(System.in);
      System.out.print("Masukkan Jumlah Gir pada sepeda2 : ");
      gir = item4_6.nextInt();
      sepeda2.setJmlGir(gir);

      System.out.println("\n----------------------------------------------\n");

      Scanner pil = new Scanner(System.in);
      System.out.print("Apakah ingin memasukkan inputan baru? (y / n) : ");
      pilih = pil.next().charAt(0);

    }
  }
}
