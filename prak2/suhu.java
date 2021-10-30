import javax.swing.JOptionPane;
public class InputPane {
public static void main(String args[]) {
int nilai;
String str = JOptionPane.showInputDialog("Masukkan nilai :");
nilai = Integer.parseInt(str);
double fahrenheit = (double)9/5 * nilai + 32.0;
System.out.println(fahrenheit);
}
}
