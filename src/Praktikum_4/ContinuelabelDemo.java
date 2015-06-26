package Praktikum_4;

public class ContinuelabelDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "A";
		String b = "A";
		boolean k = false;
		int max = a.length() - b.length();

		test: for (int q = 0; q <= max; q++) {
			int z = b.length();
			int j = q;
			int n = 0;

			// String h
			while (z-- != 0) {
				if (a.charAt(j++) != b.charAt(n++)) {
					continue test;

				}

			}
			k = true;
			System.out.println(k ? " Find text  "+b+a : "Not Found");
			break test;

		}

	}

}
