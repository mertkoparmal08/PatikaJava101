import java.util.Scanner;

public class Main {

    static boolean Palindrom(int sayi){

        int temp = sayi,lastNumber,ters =0;

        while (temp !=0){

            lastNumber = temp % 10;
            ters = (ters * 10) + lastNumber;
            temp /= 10;
        }
           if( sayi == ters){
               System.out.println(sayi + " Palindromdur.");
               return  true;
           }else{
               System.out.println(sayi + " Palindrom Deðildir.");
               return false;
           }
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("SAYI GÝRÝN: ");
        int sayi = scan.nextInt();
        
        System.out.println(Palindrom(sayi));
    }
}