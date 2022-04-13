import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		int sayi1=0, sayi2=1,toplam=0;
		
		Scanner a1=new Scanner(System.in);
		System.out.println("Bak Basamak: ");
		int n=a1.nextInt();
		System.out.print("0 1 ");
		for(int i=2;i<n;i++) {
			toplam=sayi1+sayi2;
			System.out.print(toplam+" ");
			sayi1=sayi2;
			sayi2=toplam;
		}
		
	}
}
