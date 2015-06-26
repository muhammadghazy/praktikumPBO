package Praktikum_1;

public class Perhitungan {
	static int c;
	public void tambah (int a, int b){
		c=a+b;
		System.out.print("hasil "+a+"+"+b+" ="+c);
	}
	
	public void kurang (int a, int b){
		c=a-b;
		System.out.print("hasil "+a+"-"+b+" ="+c);
	}
	
	public void kali (int a, int b){
		c=a*b;
		System.out.print("hasil "+a+"x"+b+" ="+c);
	}
	
	public void bagi (int a, int b){
		c=a/b;
		if (a==0) {
		System.out.print("error");
		}
		else if (b==0) {
		System.out.print("infinity");	
		}
		else
		System.out.print("hasil "+a+"/"+b+" ="+c);
	}
}
