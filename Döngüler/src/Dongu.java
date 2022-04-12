import java.util.Scanner;

public class Dongu {
	public static void main(String[] args) {
		int toplam=0;
		int a;
		Scanner scan=new Scanner(System.in);
		
		do {
			System.out.println("Sayý Girin.");
			a=scan.nextInt();
			
			if(a%4==0) {
				toplam+=a;
			}
		}while (a%2==0);
		
		System.out.println(toplam);
		
	}
}
