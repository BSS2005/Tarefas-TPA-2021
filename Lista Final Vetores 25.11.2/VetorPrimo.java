import java.util.Scanner;
public class VetorPrimo {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n, i, resto0=0, a[];
		a = new int[10];
		
		for (int j=0; j<10; j++) {
			resto0=0;
			
			System.out.println("Entre com um número inteiro");
			a[j]= in.nextInt();
			
            for (i=1; i<=a[j]; i++) {
            	if (a[j]%i == 0) {
            		resto0++;
            	}
            }
            if (resto0>2) {
            	System.out.println("Não é primo.");
            }else {
            	System.out.println("É primo.");
            }
	  }
	}

}
