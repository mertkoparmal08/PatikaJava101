import java.util.Scanner;

public class Hesap {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("�lk Say�: ");
		double a=scan.nextDouble();
		
		System.out.println("�kinci Say�: ");
		double b=scan.nextDouble();
		
		System.out.println("1-Toplama\\n2-��karma\\n3-�arpma\\n4-B�lme");
		System.out.println("Hangi ��lem: ");
		int n=scan.nextInt();
		
		switch (n){
			case 1:
				System.out.println("Toplam= "+(a+b));
				break;
			case 2:
				System.out.println("��karma= "+(a-b));
				break;
			case 3:
				System.out.println("�arpma= "+(a*b));
				break;
			case 4:
				if(b==0) {
					System.out.println("0'a b�l�nmez!");
					break;
				}else {
					System.out.println("B�l�m= "+(a/b));
					break;
				}
			default:
				System.out.println("Hatal� Se�im");
		}
	}
}
