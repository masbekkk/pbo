class latihan {
// Creating a Mahasiswa class with
// id and name as a attributes
public float rata;
class Mahasiswa {

  public int id, pbo, bd, rpl;
  public String name;

  // Mahasiswa class constructor
  Mahasiswa(int id, String name, int pbo, int bd, int rpl) {
    this.id = id;
    this.name = name;
    this.bd = bd;
    this.pbo = pbo;
    this.rpl = rpl;
  }
  
  void getdata(){
	System.out.println("nrp : " + id + "nama : " + name + "matkul bd : " + bd + "matkul pbo : " + pbo + "matkul rpl : " + rpl);
  }
  
  int getrata(){
  	return rata = (float)(bd+pbo+rpl)/3;
  }
}
}
  public static void main(String args[]) {
    Mahasiswa[] nilai;

    nilai = new Mahasiswa[5];

    nilai[0] = new Mahasiswa(1, "budi", 20, 30, 40);
    nilai[0].getdata();
    nilai[0].getrata();
    
  }



