import java.util.Scanner;

public class Kombinasyon {
	
    public static void main(String[] args) {
    	
        int n,r,n_faktoriyel=1,r_faktoriyel=1,c�karma_faktoriyel = 1,sonuc;
        
        Scanner input = new Scanner(System.in);
       
        System.out.print("N: ");
        n = input.nextInt();
        System.out.print("R: ");
        r = input.nextInt();
        
        int c�karma = n-r;
        
        for (int i = 1;i<=n;i++){
            n_faktoriyel *= i;
        }
        
        for (int j = 1;j<=r;j++){5
            r_faktoriyel *= j;
        }
        
        for (int k = 1;k<=c�karma;k++){
            c�karma_faktoriyel *= k;
        }
        
        sonuc = n_faktoriyel/(r_faktoriyel*c�karma_faktoriyel);
        System.out.print(sonuc);
    }
}