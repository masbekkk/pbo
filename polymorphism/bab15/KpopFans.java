public class KpopFans extends Fans{
	KpopFans(){
		this.name = "Oke";
	}
	
	KpopFans(String name){
		super.name = name;
	}
	
	void watchingPerformance(Musician musician, String expression){
		System.out.print(super.name + " : " + expression + " Melihat idolanya "); musician.perform();
	}
}
