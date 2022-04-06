import java.util.Scanner;

public class Fiyat {

	public static void main(String[] args) {
		double toplam=0;
		int km,yas,tip;
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Yol Kaç KM?");
		km=sc.nextInt();
		
		if(km<0) {
			System.out.println("Hatalý Veri Girdiniz !");
		}else {
			toplam=km*0.1;
			System.out.println("Yol Ücreti = "+toplam);
		}
		
		System.out.println("Yolcu Yaþý?");
		yas=sc.nextInt();
		
		if(yas<0) {
			System.out.println("Hatalý Veri Girdiniz !");
		}
		
		if(yas<12) {
			toplam=toplam/2;
			System.out.println("Yaþ Ýndirimi Sonrasý = "+toplam);
		}else if(yas<24) {
			toplam=toplam-(toplam*0.1);
			System.out.println("Yaþ Ýndirimi Sonrasý = "+toplam);
		}else if(yas>65) {
			toplam=toplam-(toplam*0.3);
			System.out.println("Yaþ Ýndirimi Sonrasý = "+toplam);
		}
		
		System.out.println("Tek Yön 1\nGidiþ-Dönüþ 2\nYolculuk Tipi:");
		tip=sc.nextInt();
		
		if(tip==2) {
			toplam=(toplam-(toplam/5))*2;
			System.out.println("Yolculuk Tipi Ýndirimi Sonrasý = "+toplam);
		}else if(tip==1) {
			System.out.println("Yolculuk Tipi Ýndirimi Sonrasý = "+toplam);
		}else {
			System.out.println("Hatalý Veri Girdiniz !");
		}
		
		System.out.println("Toplam Tutar = "+toplam);
	}
}
