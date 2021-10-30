import java.util.Arrays;
import java.util.Scanner;
public class tugas1 {
  public int bil, dimensi1, dimensi2, arr[][] = {
    {
      32,
      87,
      3,
      589
    },
    {
      12,
      1076,
      2000,
      8
    },
    {
      622,
      127,
      77,
      955
    }
  };

  public tugas1(int input) {
    bil = input;
  }

  public void showArrays() {
    System.out.println(Arrays.deepToString(arr));
  }

  public void findIndex() {
    for (int i = 0; i <= arr.length - 1; i++) {
      for (int j = 0; j <= arr.length - 1; j++) {
        if (arr[i][j] == bil) {
          dimensi1 = i;
          dimensi2 = j;

        }
      }
    }
  }

  public int getDim1() {
    return dimensi1;
  }

  public int getDim2() {
    return dimensi2;
  }

  public static void main(String[] args) {
    char pilih = 'y';
    while (pilih == 'y') {
      tugas1 array2d = new tugas1(0);
      //show arrays
      array2d.showArrays();
      Scanner input = new Scanner(System.in);
      System.out.print("Masukan Angka yang ingin kamu ketahui indexnya : ");
      int temp = input.nextInt();
      array2d = new tugas1(temp);
      array2d.findIndex();
      System.out.println("The (x,y) of " + temp + " is: " + array2d.getDim1() + "," + array2d.getDim2());
      System.out.println("----------------------------------------------");
      Scanner pil = new Scanner(System.in);
      System.out.print("Apakah ingin memasukkan bilangan lain ? (y / n) : ");
      pilih = pil.next().charAt(0);
    }

  }
}
