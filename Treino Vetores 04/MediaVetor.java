import java.util.Scanner;
public class MediaVetor {
   public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
       int a[], media, soma = 0, i;
       a = new int[10];
       
       for (i=0; i<10; i++) {
    	   System.out.println("Digite o "+(i+1)+"� valor do vetor A" );
    	   a[i] = in.nextInt();
       }
       for (i=0; i<10; i++) {
    	   soma = soma + a[i];
       }
       media = soma/10;
       
       System.out.println("A m�dia � "+media);
  }
}
