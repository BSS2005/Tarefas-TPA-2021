import java.util.Scanner;
public class NumeroFatorial {
    public static void main (String args[]) {
    	Scanner in = new Scanner (System.in);
    	int n, f=1, i=1;
    	System.out.println("Entre com o n�mero:");
    	n = in.nextInt();
    	while(i<=5) {
    		f=f*1;
    		i++;
    	}
    	System.out.println("O fatorial do n�mero digitado �:"+f);
    	
    	
    }
}



