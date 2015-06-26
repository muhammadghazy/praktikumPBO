package praktikum7;

public class CobaBentuk {
	public static void CetakBangun(Bentuk b){
		System.out.println(b.hitungLuas());
		b.tulis();
		b.geser(5, 5);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CetakBangun(new BujurSangkar());
		CetakBangun(new SegitigaSamaKaki());
		CetakBangun(new SegitigaSamaSisi());
	}

}
