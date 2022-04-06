import java.util.Scanner;

public class Sorgu {
	public static void main(String[] args) {
		String kullanici,sifre;
		String pass="m112233";
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Kullanýcý Adý: ");
		kullanici=scan.nextLine();
		
		System.out.println("Þifre: ");
		sifre=scan.nextLine();
		
		if(kullanici.equals("mert123")) {
			if(sifre.equals(pass)) {
				System.out.println("Giriþ Baþarýlý!!");
			}else {
				System.out.println("Giriþ Baþarýsýz!!");
				System.out.println("Þifre Sýfýrlansýn Mý?");
				System.out.println("Evet = 1\nHayýr = 2");
				int secim=scan.nextInt();
				switch (secim) {
					case 1:
						System.out.println("Yeni Þifre: ");
						String yenisifre=scan.nextLine();
						if(sifre.equals(yenisifre)) {
							System.out.println("Þifre oluþturulamadý, lütfen baþka þifre giriniz!");
						}else {
							System.out.println("Þifre oluþturuldu");
						}
						break;
					case 2:
						System.out.println("Çýkýþ Yapýldý!!");
						break;
					default:
						throw new IllegalArgumentException("Unexpected value: " + secim);
				}
			}
		}
	}
}
