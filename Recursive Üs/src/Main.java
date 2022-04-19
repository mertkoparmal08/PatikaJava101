import java.util.Scanner;

public class Main {
	
	static int us(int x,int y) {
		if(y==0) {
			return 1;
		}else {
			return x*us(x,y-1);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Taban :");
		int a=scan.nextInt();
		
		System.out.print("Üs :");
		int b=scan.nextInt();
        
        System.out.println(us(a,b));
	}
}	
