public class Shape{
	public double length, width, height, volume;
	
	public Shape(double length, double width, double height){
		this.length = length;
		this.width = width;
		this.height = height;
	}
	
	public double compareTo(Shape shape){
		double selisih;
		if(volume > shape.volume)
			selisih = volume - shape.volume;
		else
			selisih = shape.volume - volume;
		
		return selisih;
	}
	
	private void calculateVolume()
	{
		volume = length * height * width;
	}
	
	public void cetak()
	{
		calculateVolume();
		System.out.print("\nPanjang x Lebar x Tinggi = " + length + "x" + width + "x" + height);
		System.out.print(" = " + volume);
	}
}
