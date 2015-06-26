package praktikum.enam.utama;
import praktikum.enam.Rangka;

public class Mobil {
	public Rangka rangka;
	public praktikum.enam.Mesin mesin;
	private int nomor;
	protected String nama;
	
	public Mobil() {
		rangka = new Rangka();
		mesin = new praktikum.enam.Mesin();
		System.out.println("Konstruktor Mobil");
	}
	
	public void stater() {
		System.out.println("Stater Mobil");
	}

}
