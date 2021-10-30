class Pancasila {
  public String sila;

  public Pancasila(String sila) {
    this.sila = sila;
  }

  public void tampilkan() {
    System.out.println(sila);
  }

  public static void main(String args[]) {
    Pancasila init = new Pancasila("1. Ketuhanan yang Maha Esa\n2. Kemanusiaan yang Adil dan Beradab\n3. Persatuan Indonesia\n4. Kerakyatan yang dipimpin oleh hikmat kebijaksanaan dalam permusyawaratan perwakilan\n5. Keadilan sosial bagi seluruh rakyat Indonesia");

    init.tampilkan();
  }
}
