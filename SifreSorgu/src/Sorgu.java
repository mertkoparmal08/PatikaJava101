import java.util.Scanner;

public class Sorgu {
	public static void main(String[] args) {
		String kullanici,sifre;
		String pass="m112233";
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Kullan�c� Ad�: ");
		kullanici=scan.nextLine();
		
		System.out.println("�ifre: ");
		sifre=scan.nextLine();
		
		if(kullanici.equals("mert123")) {
			if(sifre.equals(pass)) {
				System.out.println("Giri� Ba�ar�l�!!");
			}else {
				System.out.println("Giri� Ba�ar�s�z!!");
				System.out.println("�ifre S�f�rlans�n M�?");
				System.out.println("Evet = 1\nHay�r = 2");
				int secim=scan.nextInt();
				switch (secim) {
					case 1:
						System.out.println("Yeni �ifre: ");
						String yenisifre=scan.nextLine();
						if(sifre.equals(yenisifre)) {
							System.out.println("�ifre olu�turulamad�, l�tfen ba�ka �ifre giriniz!");
						}else {
							System.out.println("�ifre olu�turuldu");
						}
						break;
					case 2:
						System.out.println("��k�� Yap�ld�!!");
						break;
					default:
						throw new IllegalArgumentException("Unexpected value: " + secim);
				}
			}
		}
	}
}
