 import perbankan.*;
 public class TesTugas {
   public static void main(String args[]) {
     Bank bank = new Bank();
     bank.tambahNasabah("Agus", "Daryanto");
     bank.getNasabah(0).setTabungan(new Tabungan(5000));

     bank.tambahNasabah("Tuti", "Irawan");
     bank.getNasabah(1).setTabungan(new Tabungan(7000));

     bank.tambahNasabah("Ani", "Ratna");
     bank.getNasabah(2).setTabungan(new Tabungan(4000));

     bank.tambahNasabah("Bambang", "Darmawan");
     bank.getNasabah(3).setTabungan(new Tabungan(6500));
     System.out.println("jumlah nasabah = " + bank.getJumlahNasabah());
     for (int i = 0; i < bank.getJumlahNasabah(); i++) {
       System.out.println("Nasabah ke-" + (i + 1) + " : " +
         bank.getNasabah(i).getNamaAwal() + " " +
         bank.getNasabah(i).getNamaAKhir() + " ;  Saldo= " +
         bank.getNasabah(i).getTabungan().getSaldo());
     }
   }
 }
