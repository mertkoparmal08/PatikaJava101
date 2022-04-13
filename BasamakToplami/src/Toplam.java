import java.util.Scanner;

public class Toplam {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int numberCounter=0,toplam=0;
		
		System.out.println("Sayý girin: ");
		int sayi=scan.nextInt();
		
		int a=sayi;
		
		while (a != 0) {
            a /= 10;
            numberCounter++;
		}
		
		for(int i=0;i<numberCounter;i++) {
			toplam=toplam+sayi%10;
			sayi=sayi/10;
		}
		
		System.out.println(toplam);
		
	}
}
