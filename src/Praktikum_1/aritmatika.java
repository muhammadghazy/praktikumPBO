package Praktikum_1;

public class aritmatika {
	static String nama="Muhammad Ghazy Ahkam";
	public static void main(String[] args) {
		System.out.println("Nama:"+nama);
		System.out.println("NIM: 60200112094");
		System.out.println(tambah(19,10));
		System.out.println(kurang(19,10));
		System.out.println(kali(19,10));
		System.out.println(bagi(19,10));
		System.out.println(mod(19,10));
	}
		static int tambah(int a, int b){
			return a+b;}
		static int kurang(int a, int b){
			return a-b;}
		static int kali(int a, int b){
			return a*b;}
		static float bagi(float a, float b){
			return a/b;}
		static int mod(int a, int b){
			return a % b;}
}
