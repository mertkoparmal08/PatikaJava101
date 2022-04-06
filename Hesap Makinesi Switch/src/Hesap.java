import java.util.Scanner;

public class Hesap {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Ýlk Sayý: ");
		double a=scan.nextDouble();
		
		System.out.println("Ýkinci Sayý: ");
		double b=scan.nextDouble();
		
		System.out.println("1-Toplama\\n2-Çýkarma\\n3-Çarpma\\n4-Bölme");
		System.out.println("Hangi Ýþlem: ");
		int n=scan.nextInt();
		
		switch (n){
			case 1:
				System.out.println("Toplam= "+(a+b));
				break;
			case 2:
				System.out.println("Çýkarma= "+(a-b));
				break;
			case 3:
				System.out.println("Çarpma= "+(a*b));
				break;
			case 4:
				if(b==0) {
					System.out.println("0'a bölünmez!");
					break;
				}else {
					System.out.println("Bölüm= "+(a/b));
					break;
				}
			default:
				System.out.println("Hatalý Seçim");
		}
	}
}
