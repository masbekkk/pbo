class Kecebong extends Katak{
	private double panjangEkor;
	
	Kecebong(int umur, String nama, double panjangEkor){
		super(umur, nama);
		this.panjangEkor = panjangEkor;
	}
	
	@Override
	protected String caraBergerak(){
		return "Berenang";
	}
}
