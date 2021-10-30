class tugas2 {
  public int bil1, bil2, bil3, bi1, bi2, bi3;
  public int terkecil1, terkecil2, terkecil3;

  public tugas2(int b1, int b2, int b3) {
    bil1 = bi1 = b1;
    bil2 = bi2 = b2;
    bil3 = bi3 = b3;
  }

  public void bilterkecil() {

    while ((bil1 != 0) && (bil2 != 0) && (bil3 != 0)) {
      bil1--;
      bil2--;
      bil3--;
      terkecil++;
    }
    System.out.println(terkecil + " adalah terkecil dari " + bi1 + "," + bi2 + "," + bi3);
    //return terkecil;
  }

  public static void main(String args[]) {
    tugas2 bil[] = new tugas2[3];

    bil[0] = new tugas2(8, 7, 9);
    bil[1] = new tugas2(2, 3, 1);
    bil[2] = new tugas2(1, 3, 5);

    for (int i = 0; i <= bil.length - 1; i++) {
      //System.out.println(bil[i].bilterkecil() + " adalah terkecil dari " + bil1 + "," + bil2 + "," + bil3);
      bil[i].bilterkecil();
    }
  }
}
