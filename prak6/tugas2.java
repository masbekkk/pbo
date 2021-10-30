public class tugas2 {
  public char[] matKul = {
    'p',
    'e',
    'm',
    'r',
    'o',
    'g',
    'r',
    'a',
    'm',
    'a',
    'n',
    'b',
    'e',
    'r',
    'b',
    'a',
    's',
    'i',
    's',
    'o',
    'b',
    'y',
    'e',
    'k'
  };
  public char cari;
  public int jumlah;

  public tugas2(char input) {
    cari = input;
  }

  public int findModus() {
    for (int i = 0; i <= matKul.length - 1; i++) {
      if (matKul[i] == cari) {
        jumlah++;
      }
    }
    return jumlah;
  }

  public static void main(String args[]) {

    tugas2 arrayChar = new tugas2('a');

    System.out.println(arrayChar.cari + " muncul sebanyak " + arrayChar.findModus());
  }

}
