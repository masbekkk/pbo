import java.util.Arrays;
class latihan2 {
  public static void isiFib(int[] fibo) {
    fibo[0] = 0;
    fibo[1] = 1;
    for (int i = 2; i < fibo.length; i++) {
        fibo[i] = fibo[i - 1] + fibo[i - 2];
    }
}

  public static void main(String[] args) {
    int[] fib = new int[10];
    isiFib(fib);
    System.out.println(Arrays.toString(fib));
}
}
