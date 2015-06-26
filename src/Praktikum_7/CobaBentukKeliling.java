package praktikum7;

public class CobaBentukKeliling {
	public static void CetakBangun(BentukKelliling b,BentukLuas c){
		System.out.println(b.hitungKeliling());
		System.out.println(c.hitungLuas());		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		CetakBangun(new Lingkaran(7), new Lingkaran(7));
		CetakBangun(new Trapesium(10,12,5),new Trapesium(10,12,5));
	}

}
