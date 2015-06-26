package praktikum8;

public class Coba {

	public static void main(String[] args) {
		AkunBank akun = new AkunBank(1);
		try{
			akun.penyetoran(1000);
			System.out.println("Penarikan Lebih Kecil");
			akun.penarikan(100);
			System.out.println("Penarikan Lebih Besar");
			akun.penarikan(2000);
			
			
		}
		catch(SaldoTidakCukup e){
			System.out.println(e.getMessage());
		}

	}

}
