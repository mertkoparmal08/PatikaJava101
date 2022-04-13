import java.util.Scanner;

public class Us {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int toplam=1;
		
		System.out.println("Taban:");
		int a=scan.nextInt();
		
		System.out.println("Üs:");
		int b=scan.nextInt();
		
		for(int i=0;i<b;i++) {
			toplam*=a;
		}
		System.out.println(toplam);
	}
}
