package Praktikum_1;
import java.util.Scanner;

public class Answer {
	public static int c;
	
	public static void biografi(){
		System.out.println("===========BIODATA==============");
		System.out.println("Nama : Muhammad Ghazy Ahkam");
		System.out.println("NIM  : 60200112094");
		System.out.println("TTL  : dili, 14 juli 1995");
		System.out.println("================================");		
	}
	
	public static void pilihan(){
		System.out.println("Operasi Aritmastika");
		System.out.println("1. Penjumlahan");
		System.out.println("2: Pengurangan");
		System.out.println("3: Perkalian");
		System.out.println("4: Pembagian");
	}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		biografi();
		 Scanner in = new Scanner(System.in);
	     System.out.println("Nilai A : ");
	     int a=in.nextInt();
	     System.out.println("Nilai B : ");
	     int b=in.nextInt();
	     
	     pilihan();	     
	     System.out.println("Masukkan Pilihan");
	     int pil=in.nextInt();     
	     
	     in.close();            
	     Perhitungan hitung = new Perhitungan(); 
		
		
		switch (pil){
			case 1:
				hitung.tambah(a,b);
				break;
			case 2:
				hitung.kurang(a,b);
				break;
			case 3:
				hitung.kali(a,b);
				break;
			case 4:
				hitung.bagi(a,b);
				break;
			default:
				System.out.println("Anda salah menginput pilihan..!!");
		}	
	}

}
