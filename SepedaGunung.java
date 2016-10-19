/* File : SepedaGunung.java */
package prak3;

public class SepedaGunung extends Sepeda{
	
	public SepedaGunung(int gear, int kecepatan){
		super();
	}
	
	public String toString() {
		String tmp = "Sepeda Gunung \n";
		tmp += super.toString();
		return tmp;
	}
	
	public static void main(String args[]) {
	      Sepeda encap = new Sepeda();
	      encap.setGear(10);
	      encap.setKecepatan(50);
	      System.out.println("Sepeda Gunung");
	      System.out.print("Gear : " + encap.getGear() + "\nKecepatan : " + encap.getKecepatan());
	   }

}
