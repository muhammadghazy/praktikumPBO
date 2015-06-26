package Praktikum_4;

public class Conditional2 {
	public static void Kondisional21(){
		int skor=76;
		char grade;
		
		if(skor>=90){
			grade='A';
		}
		else if(skor>=80){
			grade='B';
		}
		else if(skor>=70){
			grade='C';
		}
		else if(skor>=60){
			grade='B';
		}
		else {
			grade='F';
		}
		System.out.println("Grade = "+grade);		
	}
	
	public static void Kondisional22(){
		int nilai1 = 2;
		int nilai2 = 2;
		int hasil;
		boolean kondisi = true;
		hasil =  kondisi ? nilai1 : nilai2;
		System.out.println(hasil);		
	}
	public static void main(String[] args) {
		Kondisional22();
	}

}
