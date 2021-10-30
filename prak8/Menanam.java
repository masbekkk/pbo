class Menanam {
  //deklarasi atribut
  public String biji;
  public int butuhAir, air;

  //deklarasi konstruktor class
  public Menanam(String inputbiji, int inputbutuhAir) {
    biji = inputbiji;
    butuhAir = inputbutuhAir;
  }

  //deklarasi method tanpa return
  public void inputAir(int air) {
    air = air;
  }

  //deklarasi method dengan return
  public boolean Tumbuh() {
    boolean hasil = true;
    if (air > butuhAir) hasil = false;
    else if (butuhAir > air) hasil = false;
    else if (butuhAir == air) hasil = true;

    return hasil;
  }


public static void main(String args[]) {

  Menanam jagung = new Menanam("jagung", 200);
  System.out.println("Kamu menanam biji " + jagung.biji +
    " dengan air yang dibutuhkan sebanyak " + jagung.butuhAir + " liter");
  jagung.inputAir(300);

  if (jagung.Tumbuh() == false)
    System.out.println("Air yang kamu gunakan untuk menyiram tidak sesuai");
  else
    System.out.println("Air yang kamu gunakan untuk menyiram sudah sesuai, InsyaAllah bakal tumbuh");
}
}
