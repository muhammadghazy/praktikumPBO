package praktikum7;

public class Trapesium implements BentukLuas, BentukKelliling{
private double s1,s2,t;
	
	public Trapesium(double s1, double s2, double t){
		this.s1 = s1;
		this.s2 = s2;
		this.t = t;
	}
	@Override
	public double hitungKeliling() {
		// TODO Auto-generated method stub
		return ((s1+s2)/2)*t;
	}

	@Override
	public double hitungLuas() {
		// TODO Auto-generated method stub
		return ((s1+s2)/2)*t;
	}

}
