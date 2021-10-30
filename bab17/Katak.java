public class Katak{
	private int umur;
	private String nama;
	
	public Katak(int umur, String nama){
		this.umur = umur;
		this.nama = nama;
	}
	
	protected String caraBergerak(){
		return "Melompat";
	}
	
}
