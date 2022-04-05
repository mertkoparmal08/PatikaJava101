import java.util.Scanner;

public class Kitle {
	public static void main(String[] args) {
		double boy, index;
		int kilo;
		
		Scanner deger=new Scanner(System.in);
		
		System.out.print("Boy (m): ");
		boy=deger.nextDouble();
		
		System.out.print("Kilo (kg): ");
		kilo=deger.nextInt();
		
		index=kilo/(boy*boy);
		
		System.out.print("Vücut Ýndeksi: "+index);
	}
}
