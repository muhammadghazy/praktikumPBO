package Praktikum_5;

public class Orang2 {
	public String nama;
	public String alamat;
	public int tinggiBadan;
	public float beratBadan;
	
	public void cetakOrang(){
		System.out.println(nama + " , " + alamat + " , " + tinggiBadan + " , " + beratBadan);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orang2 objekOrang = new Orang2();
		objekOrang.nama="Awaluddin";
		objekOrang.alamat = "Makassar";
		objekOrang.tinggiBadan = 170;
		objekOrang.beratBadan = 60.4f;
		objekOrang.cetakOrang();
		
		Orang2 objekOrangDua = new Orang2();
		objekOrangDua.nama="Akhiruddin";
		objekOrangDua.alamat = "London";
		objekOrangDua.tinggiBadan = 150;
		objekOrangDua.beratBadan = 80.9f;
		objekOrangDua.cetakOrang();
		
		

	}

}
