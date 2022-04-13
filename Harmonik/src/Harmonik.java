import java.util.Scanner;

public class Harmonik {
    public static void main(String[] args) {
    	
        int n;
        double toplam=0;
        
        Scanner scan = new Scanner(System.in);

        System.out.print("Sayý giriniz : ");
        n = scan.nextInt();

        if(n>0){
            for(double i=1; i<=n; i++){
                toplam += 1/i;
            }
        }else{
            System.out.println("Negatif bir sayý girdiniz.");
        }

        System.out.println(toplam);
    }
}