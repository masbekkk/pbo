class teslatihan1{
	public static void main(String args[]) {
		latihan1 bil[] = new latihan1[4];
		
		bil[0] = new latihan1(3);
		bil[1] = new latihan1(5);
		bil[2] = new latihan1(6);
		bil[3] = new latihan1(8);
		
		for(int i=0; i<=bil.length-1; i++){
			bil[i].cek();
		}
	}
}
