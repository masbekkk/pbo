class tugas3 {
  public static void main(String[] args) {
    String caralain[] = {
      "Arrays.toString() : Menggunakan library java.util.Arrays",
      "Arrays.deepToString() : Menggunakan library java.util.Arrays",
      "Menggunakan while() sebagai ganti for loop"
    };

    System.out.println("Ada beberapa cara untuk menampilkan dan mengakses array pada java, yaitu sebagai berikut : ");
    for (int i = 0; i <= caralain.length - 1; i++) {
      System.out.println(caralain[i]);
    }
  }
}
