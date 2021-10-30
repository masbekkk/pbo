public class Truk{
	double muatan;
	double muatanmaks;
	
	public Truk(double beratmaks){
		muatanmaks = beratmaks;
	}
	
	public double getMuatan(){
		return muatan;
	}
	
	public double getMuatanMaks(){
		return muatanmaks;
	}
	
	public double tambahMuatan(double berat){
		double temp = muatan + berat;
		if(temp >= muatanmaks){
			return muatan = muatan + 0;
		
		}else{
			return muatan = muatan + berat;
		}
	}
}
