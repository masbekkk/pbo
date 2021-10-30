interface Gun{
	public void laserPointer();
}

interface usbFlash{
	public void storageMedia();
}

interface BallPoint{
	public void draw();
	public void laserPointer();
	public void storageMedia();
}

public class School implements BallPoint, Gun, usbFlash {
	
  public void laserPointer() {
    System.out.println("Show Laser...");
  }
  public void storageMedia() {
    System.out.println("Save Files...");
  }
  public void draw() {
    System.out.println("Draw or create memories...");
  }
	
}


