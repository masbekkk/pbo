public class RerataNilai{
	private int a1, a2, a3;
	private double b1, b2;
	
	protected int average(int a1, int a2){
		this.a1 = a1;
		this.a2 = a2;
		int temp = a1+a2;
		return temp/2;
	}
	
	protected double average(double b1, double b2){
		this.b1 = b1;
		this.b2 = b2;
		double temp = b1+b2;
		return temp/2;
	}
	
	protected int average(int c1, int c2, int c3){
		this.average(c1, c2);
		this.a3 = c3;
		int temp = c1+c2+c3;
		return temp/3;
	}
}

