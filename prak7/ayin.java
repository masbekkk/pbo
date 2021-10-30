class Player {
	// definisi atribut
	public String name;
	public int speed, healthPoin;

    	// definisi method run
    	public void run(){
        		System.out.println(name +" is running...");
        		System.out.println("Speed: "+ speed);
    	}

    	// definisi method isDead untuk mengecek nilai kesehatan (healthPoin)
    	public boolean isDead(){
       		if(healthPoin <= 0) return true;
        		return false;
    	}
    	
}
