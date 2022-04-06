import java.util.Scanner;

public class Burc {
	public static void main(String[] args) {
		int gun,ay;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Doðum Ayý: ");
		ay=scan.nextInt();
		System.out.println("Doðum Günü: ");
		gun=scan.nextInt();
		
		if(ay==1) {
			if(gun<21) {
				System.out.println("Oðlak ");
			}else {
				System.out.println("Kova ");
			}
		}else if (ay==2) {
			if(gun<19) {
				System.out.println("Kova ");
			}else {
				System.out.println("Balýk ");
			}
		}else if (ay==3) {
			if(gun<20) {
				System.out.println("Balýk ");
			}else {
				System.out.println("Koç ");
			}
		}else if (ay==4) {
			if(gun<21) {
				System.out.println("Koç ");
			}else {
				System.out.println("Boða ");
			}
		}else if (ay==5) {
			if(gun<22) {
				System.out.println("Boða ");
			}else {
				System.out.println("Ýkizler ");
			}
		}else if (ay==6) {
			if(gun<23) {
				System.out.println("Ýkizler ");
			}else {
				System.out.println("Yengeç ");
			}
		}else if (ay==7) {
			if(gun<23) {
				System.out.println("Yengeç ");
			}else {
				System.out.println("Aslan ");
			}
		}else if (ay==8) {
			if(gun<22) {
				System.out.println("Aslan ");
			}else {
				System.out.println("Baþak ");
			}
		}else if (ay==9) {
			if(gun<22) {
				System.out.println("Baþak ");
			}else {
				System.out.println("Terazi ");
			}
		}else if (ay==10) {
			if(gun<22) {
				System.out.println("Terazi ");
			}else {
				System.out.println("Akrep ");
			}
		}else if (ay==11) {
			if(gun<21) {
				System.out.println("Akrep ");
			}else {
				System.out.println("Yay ");
			}
		}else {
			if(gun<21) {
				System.out.println("Yay ");
			}else {
				System.out.println("Oðlak ");
			}
		}
	}
}
