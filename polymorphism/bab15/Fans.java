public class Fans{
	protected String name;
	
	Fans(){
		this.name = "No name";
	}
	
	Fans(String name){
		this.name = name;
	}
	
	protected void showName(){
		System.out.print(this.name);
	}
	
	protected void watchingPerformance(){
		System.out.println(this.name + " : Melihat idolanya dari youtube");
	}
	
	protected void watchingPerformance(Musician musician){
		System.out.println(this.name + " : Melihat idolanya "); musician.perform();
	}
}
