package praktikum7;

public abstract class Sgitiga extends Bentuk {
	protected float alas;
	protected float tinggi;
	public Sgitiga() {
		// TODO Auto-generated constructor stub
		alas=5;
		tinggi = 5;
	}

	@Override
	public float hitungLuas() {
		// TODO Auto-generated method stub
		return (alas*tinggi)/2;
	}
	

}
