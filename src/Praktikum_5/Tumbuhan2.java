package Praktikum_5;

public class Tumbuhan2 {
	private String namaSpesies;
	private int lebarDaun;
	
	private Tumbuhan2(){
		namaSpesies = "Sayur";
		lebarDaun = 30;
	}
	
	private Tumbuhan2(String nama, int lebar){
		namaSpesies = nama;
		lebarDaun = 30;
	}
	public void cetakTumbuhan(){
		System.out.println(namaSpesies+ " " + lebarDaun);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tumbuhan2 tumbuhan = new Tumbuhan2();
		tumbuhan.cetakTumbuhan();
		Tumbuhan2 tumbuhan1 = new Tumbuhan2("Buah", 20);
		tumbuhan1.cetakTumbuhan();

	}

}
