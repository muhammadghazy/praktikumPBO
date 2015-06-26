package praktikum.enam.mobil;
import praktikum.enam.Mesin;
import praktikum.enam.Rangka;
import praktikum.enam.utama.Mobil;

public class Truk extends Mobil {
	public Truk() {
		
	}
	
	public void tongkang() {
		mesin = new Mesin();
		stater();
		
		nama = "Truk";
		System.out.println("Tongkang");
	}
	
	public static void main(String[] args) {
		Truk truk = new Truk();
		truk.tongkang();
	}

}
