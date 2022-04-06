import java.util.Scanner;

public class Oneri {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Kaç Derece?");
		int s=scan.nextInt();
		
		if(s<5) {
			System.out.println("Kayak!");
		}else {
			if(s<15) {
				System.out.println("Sinema!");
			}else {
				if(s<25) {
					System.out.println("Piknik!");
				}else {
					System.out.println("Yüzme!");
				}
			}
		}
	}
}
