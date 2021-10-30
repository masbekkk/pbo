public class Sup extends Base {
  public static void main(String argv[]) {
    Sup s = new Sup();
    //baris 1
    s.derived();
  }
  Sup() {
    //baris 2
    super(1);
  }
  public void derived() {
    //baris 3
    new Sup();
  }
  

}
