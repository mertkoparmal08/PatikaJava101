import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        
		int ebob=1, ekok;

		Scanner scan= new Scanner(System.in);
		
		System.out.println("Sayý 1: ");
		int n1=scan.nextInt();
		
		System.out.println("Sayý 2: ");
		int n2=scan.nextInt();
		
		int i=1;
		
		while(i<n1 && i<n2) {
			if(n1 % i == 0 && n2 % i == 0)
	               ebob = i;
			++i;
		}

       ekok = (n1 * n2) / ebob;
       System.out.printf("%d ve  %d sayýlarýnýn EBOB'u %d \n", n1, n2, ebob);
       System.out.printf("%d ve  %d sayýlarýnýn EKOK'u %d \n", n1, n2, ekok); 
   } 
}
