class tugas1 {
  public int a1 = 0, a2 = 1, a3 = 0;

  public void fibo(int batas) {
    if (batas > 0) {
      a3 = a1 + a2;
      a1 = a2;
      a2 = a3;
      System.out.print(" " + a3);
      fibo(batas - 1);
    }
  }

  public static void main(String args[]) {
    tugas1 bil = new tugas1();
    System.out.print(bil.a2); //printing 1
    bil.fibo(8);
  }
}
