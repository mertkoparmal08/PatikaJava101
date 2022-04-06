import java.util.Scanner;

public class Fiyat {

	public static void main(String[] args) {
		double toplam=0;
		int km,yas,tip;
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Yol Ka� KM?");
		km=sc.nextInt();
		
		if(km<0) {
			System.out.println("Hatal� Veri Girdiniz !");
		}else {
			toplam=km*0.1;
			System.out.println("Yol �creti = "+toplam);
		}
		
		System.out.println("Yolcu Ya��?");
		yas=sc.nextInt();
		
		if(yas<0) {
			System.out.println("Hatal� Veri Girdiniz !");
		}
		
		if(yas<12) {
			toplam=toplam/2;
			System.out.println("Ya� �ndirimi Sonras� = "+toplam);
		}else if(yas<24) {
			toplam=toplam-(toplam*0.1);
			System.out.println("Ya� �ndirimi Sonras� = "+toplam);
		}else if(yas>65) {
			toplam=toplam-(toplam*0.3);
			System.out.println("Ya� �ndirimi Sonras� = "+toplam);
		}
		
		System.out.println("Tek Y�n 1\nGidi�-D�n�� 2\nYolculuk Tipi:");
		tip=sc.nextInt();
		
		if(tip==2) {
			toplam=(toplam-(toplam/5))*2;
			System.out.println("Yolculuk Tipi �ndirimi Sonras� = "+toplam);
		}else if(tip==1) {
			System.out.println("Yolculuk Tipi �ndirimi Sonras� = "+toplam);
		}else {
			System.out.println("Hatal� Veri Girdiniz !");
		}
		
		System.out.println("Toplam Tutar = "+toplam);
	}
}
