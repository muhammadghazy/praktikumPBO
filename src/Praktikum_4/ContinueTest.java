package Praktikum_4;

public class ContinueTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String kalimat = "Something Missing in a Text";
		int maks = kalimat.length();
		int jumlahA = 0;
		for (int i = 0; i < maks; i++) {
			if (kalimat.charAt(i) != 'a')
				continue;
			jumlahA++;

		}
		System.out.println("Finded " + jumlahA + " char 'A'  int text"+ kalimat);
	}

}
