public class Main {
	public static void Jabatan(Pegawai pekerja) {
		if (pekerja instanceof Manajer) {
			Manajer a = (Manajer) pekerja;
			System.out.println("\nJabatan\t: Manajer");
			System.out.println("Nama\t: " + a.nama);
			System.out.println("Gaji\t: " + a.gaji);
		} else if (pekerja instanceof Kurir) {
			Kurir b = (Kurir) pekerja;
			System.out.println("\nJabatan\t: Kurir");
			System.out.println("Nama\t: " + b.nama);
			System.out.println("Gaji\t: " + b.gaji);
		}
	}

	public static void main (String[] args){
		Manajer pekerja1 = new Manajer("Madani", 30000000);
		Jabatan(pekerja1);
		Kurir pekerja2 = new Kurir("Sofi", 8000000);
		Jabatan(pekerja2);
		Kurir pekerja3 = new Kurir("Arina", 1000000);
		Jabatan(pekerja3);
	}
}
