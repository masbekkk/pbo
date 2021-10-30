class Gun extends Weapon{
	private int bullets;
	
	Gun(int bullets){
		this.bullets = bullets;
	}
	
	protected void attack(){
		System.out.println("Menembakkan Peluru");
	}
}
