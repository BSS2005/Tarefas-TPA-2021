import java.util.Scanner;
public class VetorAB10 {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		final int TAM=5;
		int a[], b[], i;
		a = new int[TAM];
		b = new int[TAM];
		
		for (i = 0; i<TAM; i++ ) {
			System.out.println("Digite o "+(i+1)+" valor do vetor A");
			a[i] = ler.nextInt();
			b[i] = a[i]*a[i];
		}
		
		for (i = 0; i<TAM; i++) {
			System.out.print(a[i]+ " - ");
		}
		
		System.out.println();
		for (i = 0; i<TAM; i++) {
			System.out.print(b[i]+ " - ");
		}
	}

}
