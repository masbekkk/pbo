public class Mobil{
	String A, B, C;
	int D, E;
	
	public Mobil(String merk, String warna, String jenis, int cc, int penumpang){
		A = merk;
		B = warna;
		C = jenis;
		D = cc;
		E = penumpang;
	}
	
	public void infoMobil(int index){
	
		System.out.println("Nomor Mobil : " + index + "\n");
		System.out.println("Merk : " + A + " || " + "Warna : " + B + " || " + "Jenis : " + C + " || " + "CC : " + D + " || " + "Penumpang : " + E + " || \n");
		System.out.println("\n=====================================================================================\n");
		
	}
}
