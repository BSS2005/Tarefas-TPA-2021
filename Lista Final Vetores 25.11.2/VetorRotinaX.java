import java.util.Scanner;
public class VetorRotinaX {
    public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int a[] = new int[10];
		boolean Verdadeiro = false;
		
		for(int i=0; i<a.length; i++) {
			System.out.println("preenncha o vetor A["+i+"]:");
			a[i] = in.nextInt();
		}
		
		System.out.println("Qual elemento voc� quer verificar");
		int x = in.nextInt();
		
		for (int i=0; i<a.length; i++) {
			if (a[i]==x) {
				Verdadeiro = true;
			}
		}
		
		if (Verdadeiro){
			System.out.println("O n�mero "+x+" existe no vetor A!");
		}else {
			System.out.println("O n�mero "+x+"n�o existe no vetor B!");
		}
	}
}
