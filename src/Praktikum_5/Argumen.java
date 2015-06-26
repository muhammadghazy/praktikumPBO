package Praktikum_5;

public class Argumen {
	public static void passingPrimitif(int i){
		i=5;
	}
	public static void passingObject(Titik t){
		t.x=4;
		t.y=5;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 5;
		passingPrimitif(i);
		System.out.println(i);
		
		Titik t = new Titik();
		passingObject(t);
		System.out.println(t.x + " " + t.y);
		
	}

}
class Titik {
	public int x;
	public int y;
	
	public Titik(){
		x = 0;
		y = 0;
	}
}
