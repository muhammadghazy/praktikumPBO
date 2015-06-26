package Praktikum_5;

public class Hewan {
	public static int JUMLAH_HEWAN = 0;
	public String spesies;
	public static void tambahHewan() {
		JUMLAH_HEWAN++;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hewan objekHewan = new Hewan();
		objekHewan.spesies = "Kucing";
		Hewan.tambahHewan();
		System.out.println(Hewan.JUMLAH_HEWAN);
		
		Hewan objekHewanDua = new Hewan();
		objekHewanDua.spesies = "Anjing";
		Hewan.tambahHewan();
		System.out.println(objekHewanDua.JUMLAH_HEWAN);
		
		System.out.println(Hewan.JUMLAH_HEWAN);
		System.out.println(objekHewanDua.JUMLAH_HEWAN);

	}

}

