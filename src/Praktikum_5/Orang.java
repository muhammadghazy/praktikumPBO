package Praktikum_5;

public class Orang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Orang objekOrang = new Orang();
		Hewan objekHewan = null;
		if(objekOrang instanceof Orang){
			System.out.println("objekOrang adalah instan dari Kelas Orang");
		} else if (objekHewan == null) {
			System.out.println("objekHewan belum diinisialisasikan");
			
		}
		

	}

}