package Praktikum_5;

public class ArgumenDua {
	public static void argumentArray(int[] args){
		System.out.println(args[0] + " , " + args[1] + " , " + args[2]);
	}
	
	public static void argumentSembarang(int... args){
		System.out.println(args[0] + " , " + args[1] + " , " + args[2]);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i[] = {1,2,3};
		argumentArray(i);
		argumentSembarang(i);

	}

}
