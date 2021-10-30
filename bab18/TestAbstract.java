public class TestAbstract {
  public static void main(String args[]) {
    Weapon weapon = new Knife();
    Weapon knife = new Knife();
    Weapon gun = new Gun(10);
    knife.attack();
    System.out.println("Senjata");
    gun.attack();
    System.out.println("Sisa Peluru : 9");
    System.out.println("Senjata");
    gun.attack();
    System.out.println("Sisa Peluru : 8");
    Knife knife2 = new Knife();
    Weapon gun2 = new Gun(10);
    knife2.attack();
    System.out.println("Senjata");
    gun2.attack();
    System.out.println("Sisa Peluru : 9");
    System.out.println("Senjata");
    gun2.attack();
    System.out.println("Sisa Peluru : 8");
  }
}
