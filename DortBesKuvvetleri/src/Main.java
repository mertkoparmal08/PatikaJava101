import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int sayi;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Number: ");
        sayi = input.nextInt();

        for (int i = 1; i <= sayi; i *= 4)
            System.out.print(i + " - ");

        System.out.println();
        
        for (int j = 1; j < sayi; j *= 5)
            System.out.print(j + " - ");
    }
}