import java.util.Scanner;

public class Ortalama {
	
	public static void main(String[] args) {
		
		int sayac=0,toplam=0;
		
		Scanner scan=new Scanner(System.in);
		
		int a=scan.nextInt();
		
		for(int i=0;i<a;i++) {
			if((i%3==0) && (i%4==0)) {
				toplam+=i;
				sayac++;
			}
		}
		
		toplam=toplam/sayac;
		
		System.out.println(toplam);
	}
}
