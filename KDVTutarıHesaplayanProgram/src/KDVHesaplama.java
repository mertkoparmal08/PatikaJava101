import java.util.Scanner;

public class KDVHesaplama {
	public static void main(String[] args) {
		double tutar, kdvOran, kdvTutar = 0, kdvliTutar = 0;
		
		Scanner input= new Scanner(System.in);
		System.out.print("�cret Tutar� : ");
		tutar=input.nextDouble();
		
		if(tutar >0 && tutar<=1000) {
			kdvTutar = tutar*0.18;
			kdvliTutar= tutar+ kdvTutar;
			
			System.out.println("Tutar: " +tutar);
			System.out.println("KDV Tutar�: " +kdvTutar);
			System.out.println("Toplam Tutar: " +kdvliTutar);
		}
		else if (tutar>1000) {
			kdvTutar = tutar*0.08;
			kdvliTutar= tutar+ kdvTutar;
			
			System.out.println("Tutar: " +tutar);
			System.out.println("KDV Tutar�: " +kdvTutar);
			System.out.println("Toplam Tutar: " +kdvliTutar);
			
		}else if(tutar<0) {
			System.out.println("Tutar Negatif Olamaz ! ");
		}
		
		
	}
}
