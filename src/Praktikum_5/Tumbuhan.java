package Praktikum_5;

public class Tumbuhan {
	public void tanam() {
		System.out.println("Tanam 1");
	}
	
	public void tanam(String nama) {
		System.out.println("Tanam 2");
	}
	
	public void tanam(int jumlah) {
		System.out.println("Tanam 3");
	}
	
	public String tanam(String nama, int jumlah) {
		return "Tanam 5";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tumbuhan tumbuhan = new Tumbuhan();
		tumbuhan.tanam();
		tumbuhan.tanam("Sayur");
		tumbuhan.tanam(4);
		tumbuhan.tanam(51);
		System.out.println(tumbuhan.tanam("Sayur", 5));
		

	}

}
