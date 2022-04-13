import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        
		Scanner scan= new Scanner(System.in);
		int kucuk=0, buyuk=0;
		
		System.out.println("Kaç Sayý Girilecek: ");
		int n=scan.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println(i+". Sayý: ");
			int sayi=scan.nextInt();
			
			if (sayi > buyuk) {
                if (kucuk == 0) {
                	kucuk = sayi;
                }
                buyuk = sayi;
            }
            if (sayi < kucuk) {
                if (buyuk == 0) {
                	buyuk = sayi;
                }
                kucuk = sayi;
            }
		}
		
		System.out.println("En Küçük Sayý: "+kucuk);
		System.out.println("En Büyük Sayý: "+buyuk);
   } 
}