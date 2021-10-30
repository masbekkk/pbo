public class cekSekolahGresik {
  public String namaSekolah;

  public cekSekolahGresik(String nama) {
    namaSekolah = nama;
  }

  public int cek() {
    int hasil = namaSekolah.indexOf("Gresik");
    return hasil;
  }

  public static void main(String args[]) {
    cekSekolahGresik nama = new cekSekolahGresik("MAN 2 Surabaya");
    if (nama.cek() == -1)
      System.out.println(nama.namaSekolah + " bukan dari Gresik ");
    else
      System.out.println(nama.namaSekolah + " adalah dari Gresik ");
  }
}
