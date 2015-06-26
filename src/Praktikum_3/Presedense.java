package lap3;

public class Presedense {

	public static void main(String[] args) {
		byte angka = 5;
		byte angka2 = -5;
		
		int hasil = angka++ >> 4 + 5 * 4 | 5 << angka2;
		int hai = 5 << angka2;
		int hasil3 = 0 | hai;
		
		System.out.println(hasil);
		System.out.println(hai);
		System.out.println(hasil3);

	}

}
