import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        
		Scanner scan= new Scanner(System.in);
		int kucuk=0, buyuk=0;
		
		System.out.println("Ka� Say� Girilecek: ");
		int n=scan.nextInt();
		
		for(int i=1;i<=n;i++) {
			System.out.println(i+". Say�: ");
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
		
		System.out.println("En K���k Say�: "+kucuk);
		System.out.println("En B�y�k Say�: "+buyuk);
   } 
}