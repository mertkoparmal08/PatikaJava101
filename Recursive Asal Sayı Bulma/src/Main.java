import java.util.Scanner;

public class Main {
	
	static boolean asal(int n,int i) {
		
		if (n == 2) {
            return true;
           
        } else if (n % i == 0) {
            return false;
            
        } else if (i*i > n) {
            return true;
        }

        return asal(n, i + 1);
	}
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Sayý :");
		int a=scan.nextInt();
        
		if (asal(a, 2)) {
            System.out.println(a + " asaldýr.");
        } else {
            System.out.println(a + " asal deðildir.");
        }
	}
}	
