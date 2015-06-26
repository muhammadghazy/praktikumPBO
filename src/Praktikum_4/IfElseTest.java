package Praktikum_4;

public class IfElseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int skor = 98;
		char grade;

		if (skor >= 90) {
			grade = 'A';
		} else if (skor >= 80) {
			grade = 'B';

		} else if (skor >= 70) {
			grade = 'C';

		} else {
			grade = 'D';

		}
		System.out.println("Grade = " + grade);
	}

}
