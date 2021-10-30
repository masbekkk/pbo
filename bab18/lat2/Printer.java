public interface Scanner {
  public void scaneImage() {
    System.out.println("Scanning image...");
  }
}

public interface Copier {
  public void copyImage();
}

public class Printer implements Copier, Scanner {
  
  public void scaneImage() {
    System.out.println("Scanning image...");
  }
  
  public void copyImage() {
    System.out.println("Copy image...");
  }
  public void printImage() {
    System.out.println("Print image...");
  }
}
