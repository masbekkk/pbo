public static void main(String[] args) {
  double d = 64.25;
  float f = (float) d;
  long l = (long) f;
  int i = (int) l;
  char c = (char) i;
  short s = (short) i;
  byte b = (byte) s;
  System.out.println("Double ke Byte");
  System.out.println("Double : " + d);
  System.out.println("Float : " + f);
  System.out.println("Long : " + l);
  System.out.println("Int : " + i);
  System.out.println("Short : " + s);
  System.out.println("Byte : " + b);
  System.out.println();
  System.out.println("Double ke Char");
  System.out.println("Double : " + d);
  System.out.println("Float : " + f);
  System.out.println("Long : " + l);
  System.out.println("Int : " + i);
  System.out.println("Char : " + c);
}
}
