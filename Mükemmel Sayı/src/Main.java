import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		int toplam=0;
		
		Scanner scan =new Scanner(System.in);
		System.out.println("Say� Girin: ");
		int a=scan.nextInt();
		
		for(int i=1;i<a;i++) {
			if(a%i==0) {
				toplam+=i;
			}
		}
		if(toplam==a) {
			System.out.println(a+" M�kemmel Say�d�r.");
		}else {
			System.out.println(a+" M�kemmel Say� De�ildir.");
		}
	}
}
