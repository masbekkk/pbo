public class TesTugas2 {
  public static void main(String[] args) {
    Katak o1 = new Katak(5, "Froggy");
    Kecebong o2 = new Kecebong(2, "Junior Frog", 10);

    System.out.println("Obyek\tUmur\tNama\t\tPjgEkor\tcaraBergerak");
    System.out.println("O1\t" + o1.umur + "\t" + o1.nama + "\t\t\t" + o1.caraBergerak());
    System.out.println("O2\t" + o2.umur + "\t" + o2.nama + "\t" + o2.panjangEkor + "\t" + o2.caraBergerak());
  }
}
