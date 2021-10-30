public class Dosen extends Orang{
	private int nip;
	
	Dosen(String nama){
		super(nama);
	}
	
	Dosen(String nama, int nip){
		super(nama);
		this.nip = nip;
	}
	
	Dosen(String nama, int nip, int umur){
		super(nama, umur);
		this.nip = nip;
	}
	
	void Info(){
		if(!(super.nama == null)) System.out.println("Nama : " + super.nama);
		else System.out.println("Nama : - ");
		if(!(this.nip == 0)) System.out.println("NIP : " + this.nip);
		else System.out.println("NIP : - ");
		if(!(super.umur == 0)) System.out.println("Umur : " + super.umur);
		else System.out.println("Umur : - ");
	}
}
