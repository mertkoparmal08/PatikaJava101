import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {

        Scanner scan= new Scanner(System.in);
        
        System.out.print("Sayý Giriniz : ");
        int sayi=scan.nextInt();
        
        System.out.print(desen(sayi,sayi,0));

    }

    static int desen(int x,int y,int z){
        System.out.print(y+" ");
        
        if(y<=0 || z==1) {
            while(x!=y){
                return desen(x,(y + 5),1);
            }
            System.exit(0);
        }
        return desen(x,(y-5),0);
    }
}	
