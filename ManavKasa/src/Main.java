import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		double toplam=0, armut=2.14, elma=3.67, dom=1.11, muz=0.95, pat=5.0;
		int kilo;
		
		Scanner deger=new Scanner(System.in);
		
		System.out.print("Ka� Kilo Armut: ");
		kilo=deger.nextInt();
		
		toplam=toplam+kilo*armut;
		
		System.out.print("Ka� Kilo Elma: ");
		kilo=deger.nextInt();
		
		toplam=toplam+kilo*elma;
		
		System.out.print("Ka� Kilo Domates: ");
		kilo=deger.nextInt();
		
		toplam=toplam+kilo*dom;
		
		System.out.print("Ka� Kilo Muz: ");
		kilo=deger.nextInt();
		
		toplam=toplam+kilo*muz;
		
		System.out.print("Ka� Kilo Patl�can: ");
		kilo=deger.nextInt();
		
		toplam=toplam+kilo*pat;
		
		
		System.out.print("Toplam:"+toplam);
	}
}
