package Praktikum_4;

public class BreakTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] angka = { 1, 2, 4, 23, 44, 1, 67, 89 };
		int cari = 44;
		int i;
		Boolean ketemu = false;
		for (i = 0; i < angka.length; i++) {
			if (angka[i] == cari) {
				ketemu = true;
				break;
			}
		}
		if (ketemu) {
			System.out.println("Find string  " + cari + " in index " + i);
		}

		else {
			System.out.println(cari + " not found in array");
		}
	}

}
