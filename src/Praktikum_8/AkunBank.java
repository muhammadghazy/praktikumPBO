package praktikum8;

public class AkunBank {
	private int nomer;
	private double saldo;
	
	public AkunBank(int nomor ){
		nomer = nomor;
	}
	
	public int getNomer(){
		return nomer;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public void penyetoran(int jumlah){
		saldo = jumlah;
	}
	
	public void penarikan(int jumlah) throws SaldoTidakCukup{
		if(jumlah>=saldo){
			throw new SaldoTidakCukup();
		}
		System.out.println("Nilai Penarikan = "+jumlah);
		
	}

}
