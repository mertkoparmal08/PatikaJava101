import java.util.Scanner;

public class Kombinasyon {
	
    public static void main(String[] args) {
    	
        int n,r,n_faktoriyel=1,r_faktoriyel=1,cýkarma_faktoriyel = 1,sonuc;
        
        Scanner input = new Scanner(System.in);
       
        System.out.print("N: ");
        n = input.nextInt();
        System.out.print("R: ");
        r = input.nextInt();
        
        int cýkarma = n-r;
        
        for (int i = 1;i<=n;i++){
            n_faktoriyel *= i;
        }
        
        for (int j = 1;j<=r;j++){
            r_faktoriyel *= j;
        }
        
        for (int k = 1;k<=cýkarma;k++){
            cýkarma_faktoriyel *= k;
        }
        
        sonuc = n_faktoriyel/(r_faktoriyel*cýkarma_faktoriyel);
        System.out.print(sonuc);
    }
}
