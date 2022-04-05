import java.util.Scanner;

public class Alan {
	public static void main(String[] args) {
		int a,b,c;
		double alan, u;
		
		Scanner deger = new Scanner(System.in);
		
		System.out.print("1. Kenar: \n");
		a=deger.nextInt();
		
		System.out.print("2. Kenar: \n");
		b=deger.nextInt();
		
		System.out.print("3. Kenar: \n");
		c=deger.nextInt();
		
		u= (a+b+c)/2;
		
		alan=Math.sqrt((u*(u-a)*(u-b)*(u-c)));
		System.out.print("Alan: "+alan);
	}
}
