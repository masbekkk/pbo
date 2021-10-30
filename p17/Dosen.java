public class Dosen extends Orang {
  private int nip;

  public Dosen(String nama) {
    super(nama);
    this.nama = nama;
  }

  public Dosen(String nama, int nip) {
    super(nama);
    this.nama = nama;
    this.nip = nip;
  }

  public Dosen(String nama, int nip, int umur) {
    super(nama, umur);
    this.nama = nama;
    this.nip = nip;
    this.umur = umur;
  }

  public void Info() {
    System.out.println("Nama : " + nama);
    if (nip != 0)
      System.out.println("NIP : " + nip);
    else
      System.out.println("NIP : -");

    if (umur != 0)
      System.out.println("Umur : " + umur);
    else
      System.out.println("Umur : -");
  }
}
