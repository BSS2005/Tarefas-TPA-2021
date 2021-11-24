import java.util.Scanner;
public class Vetor10Elementos {
    public static void main(String[] args) {
    	Scanner in = new Scanner (System.in);
		int i, j, length=10;
		
		Integer [] a = new Integer [length];
		Integer [] b = new Integer [length];
		
		for (i=0; i<a.length; i++) {
			System.out.println("Digete o "+(i+1)+"º elemento do vetor A");
			a[i] = in.nextInt();		
		}
		System.out.println(" ");
		
		for(i=0; i<b.length; i++) {
			System.out.println("Digite o "+(i+1)+"º elemento do vetor B");
			b[i] = in.nextInt(); }
		

		for(i=0; i<length; i++) {
			for(j=0; j<length; j++) {
				if (b[i] == a[j]) {
					a[j] = null;
				}
			}
		}
		System.out.print("A - B = [ " );
		for (int k = 0; k<a.length; k++) {
			if(a[k]!= null) {
				System.out.println(a[k]+" ");
			}
		}
		System.out.println(" ] ");
		}
	}

