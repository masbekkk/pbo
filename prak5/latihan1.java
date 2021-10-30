class latihan1 {
  public int bil, hasil = 1;

  public latihan1(int input) {
    bil = input;
  }

  public void show() {
    System.out.print("\nN         N!\n============\n");
    for (int i = 1; i <= bil; i++) {

      hasil = hasil * i;
      System.out.print(i + "          " + hasil + "\n");
    }
  }

  public static void main(String args[]) {
    latihan1 faktorial = new latihan1(3);
    faktorial.show();
  }
}
