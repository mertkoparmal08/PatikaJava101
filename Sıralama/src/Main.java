import java.util.Scanner;

public class Main {
	public static void main(System[] args) {
		int a,b,c;
		
		Scanner sayi=new Scanner(System.in);
		
		System.out.println("Sayý 1: ");
		a=sayi.nextInt();
		
		System.out.println("Sayý 2: ");
		b=sayi.nextInt();
		
		System.out.println("Sayý 3: ");
		c=sayi.nextInt();
		
		if((a<b) && (a<c)) {
			if(b<c) {
				System.out.println(a+"<"+b+"<"+c);
			}else {
				System.out.println(a+"<"+c+"<"+b);
			}
		}
		else if((b<a)&&(b<c)) {
			if(a<c) {
				System.out.println(b+"<"+a+"<"+c);
			}else {
				System.out.println(b+"<"+c+"<"+a);
			}
		}else {
			if(a<b) {
				System.out.println(c+"<"+a+"<"+b);
			}else {
				System.out.println(c+"<"+b+"<"+a);
			}
		}
	}
}
