import java.util.Scanner;

public class Burc {
	public static void main(String[] args) {
		int gun,ay;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Do�um Ay�: ");
		ay=scan.nextInt();
		System.out.println("Do�um G�n�: ");
		gun=scan.nextInt();
		
		if(ay==1) {
			if(gun<21) {
				System.out.println("O�lak ");
			}else {
				System.out.println("Kova ");
			}
		}else if (ay==2) {
			if(gun<19) {
				System.out.println("Kova ");
			}else {
				System.out.println("Bal�k ");
			}
		}else if (ay==3) {
			if(gun<20) {
				System.out.println("Bal�k ");
			}else {
				System.out.println("Ko� ");
			}
		}else if (ay==4) {
			if(gun<21) {
				System.out.println("Ko� ");
			}else {
				System.out.println("Bo�a ");
			}
		}else if (ay==5) {
			if(gun<22) {
				System.out.println("Bo�a ");
			}else {
				System.out.println("�kizler ");
			}
		}else if (ay==6) {
			if(gun<23) {
				System.out.println("�kizler ");
			}else {
				System.out.println("Yenge� ");
			}
		}else if (ay==7) {
			if(gun<23) {
				System.out.println("Yenge� ");
			}else {
				System.out.println("Aslan ");
			}
		}else if (ay==8) {
			if(gun<22) {
				System.out.println("Aslan ");
			}else {
				System.out.println("Ba�ak ");
			}
		}else if (ay==9) {
			if(gun<22) {
				System.out.println("Ba�ak ");
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
				System.out.println("O�lak ");
			}
		}
	}
}
