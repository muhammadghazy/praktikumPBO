package Praktikum_2;

public class nilaiDefault {
	static String \u0073\u0074\u0072 = "Muhammad Ghazy Ahkam_60200112094_PBO";
	static boolean bool;
	static long lng=67;
	static short sh;
	static int i;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if (lng<=0) {
			System.out.println("nilai default boolean " + bool);
			System.out.println("nilai default long " + lng);
			System.out.println("nilai default int " + i);
			System.out.println("nilai default short " + sh);
			System.out.println(str);
		} else {
			Boolean refBool = new Boolean(true); 
			boolean bool = refBool.booleanValue();		
			System.out.println("bool " + bool);
			
			Integer refInt = new Integer(32671);
			int i = refInt.intValue();		
			System.out.println("int " + i);
			
			Long refL = new Long(200112029);
			long l = refL.longValue();		
			System.out.println("long " + lng);
			
			Short refSh = new Short((short) 'A');
			short s = refSh.shortValue();	/*diterjemahkan menajdi kode ASCII*/
			System.out.println("short " + s);
			
			System.out.println(str);
			
		}
	}

}
