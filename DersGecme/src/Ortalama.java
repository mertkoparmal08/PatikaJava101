import java.util.Scanner;

public class Ortalama {
	public static void main(String[] args) {
		
		int mat,fizik,turkce,kimya,muzik;
		int a=0,toplam=0;
		double ort;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Matematik Notunuz: ");
		mat=scan.nextInt();
		
		if(mat<100 && mat>0) {
			toplam+=mat;
			a+=1;
		}
		
		System.out.println("Fizik Notunuz: ");
		fizik=scan.nextInt();
		
		if(fizik<100 && fizik>0) {
			toplam+=fizik;
			a+=1;
		}
		
		System.out.println("Türkçe Notunuz: ");
		turkce=scan.nextInt();	
		
		if(turkce<100 && turkce>0) {
			toplam+=turkce;
			a+=1;
		}
		
		System.out.println("Kimya Notunuz: ");
		kimya=scan.nextInt();
		
		if(kimya<100 && kimya>0) {
			toplam+=kimya;
			a+=1;
		}
		
		System.out.println("Müzik Notunuz: ");
		muzik=scan.nextInt();
		
		if(muzik<100 && muzik>0) {
			toplam+=muzik;
			a+=1;
		}
		
		ort=toplam/a;
		
		if(ort>=55) {
			System.out.println(ort +" ile Geçti!");
		}else {
			System.out.println(ort +" ile Kaldý");
		}
		
		
	}
}