class latihan2 {
  public int bil;

  public latihan2(int batas) {
    bil = batas;
  }

  public void show() {
    int i = 2;
    while (i <= bil) {
      if (i % 6 == 0) {
        i += 2;
      } else {
        System.out.print(i + " ");
        i += 2;
      }

    }
  }

  public static void main(String args[]) {
    latihan2 genap = new latihan2(20);
    genap.show();
  }
}
