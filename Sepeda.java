/* File : Sepeda.java */
package prak3;

public class Sepeda {
	private int gear;
	private int kecepatan;
	
	public int getGear(){
		return gear;
	}
	
	public int getKecepatan(){
		return kecepatan; 
	}
	
	public void setGear(int gear) {
		this.gear = gear;
	}
	
	public void setKecepatan(int kecepatan) {
		this.kecepatan = kecepatan;
	}
	
	public void addSpeed(int speed) {
		this.kecepatan += speed;
	}
	
	public void Rem(int minus) {
		this.kecepatan -= minus;
	}
	
	public String toString()
	{
		String tmp = "Sepeda \n";
		tmp += "Gear :" + this.gear + "\n";
		tmp += "Kecepatan :" + this.kecepatan;
		return tmp;
	}
}
