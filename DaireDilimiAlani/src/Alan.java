import java.util.Scanner;

public class Alan {

	public static void main(String[] args) {
		double pi=3.14, r, alan;
		int derece;
		
		Scanner deger=new Scanner(System.in);
		
		System.out.print("Yarýçap: ");
		r=deger.nextDouble();
		
		System.out.print("Merkez Açý Ölçüsü: ");
		derece=deger.nextInt();
		
		alan=(pi*r*r*derece/360);
		
		System.out.print("Alan: "+alan);
		
	}
}
