import java.util.Scanner;
public class NotOrtalamasi {
	public static void main(String [] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;
        Scanner inp = new Scanner(System.in);
        System.out.print("Matematik Notunuz: ");
        matematik = inp.nextInt();
        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();
        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();
        System.out.print("T�rk�e Notunuz: ");
        turkce = inp.nextInt();
        System.out.print("Tarih Notunuz: ");
        tarih = inp.nextInt();
        System.out.print("M�zik Notunuz: ");
        muzik = inp.nextInt();

        double ort = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;
        boolean result = ort >= 60 || ort < 60;
        String sonu� = (result) ? "S�n�f� Ge�ti" : "S�n�fta Kald�";
        System.out.println(ort);
        System.out.println(sonu�);
    }
}
