package praktikum7;

public class Lingkaran implements BentukKelliling, BentukLuas {
private double jariJari;
	
	public Lingkaran(double jariJari){
		this.jariJari = jariJari;
	}

	@Override
	public double hitungKeliling() {
		// TODO Auto-generated method stub
		return 2*BentukKelliling.PHI*jariJari;
	}

	@Override
	public double hitungLuas() {
		// TODO Auto-generated method stub
		return BentukLuas.PHI*Math.pow(jariJari,2);
	}

}
