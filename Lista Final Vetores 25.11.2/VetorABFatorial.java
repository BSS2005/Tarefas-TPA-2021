import java.util.Scanner;
public class VetorABFatorial {
    public static void main(String[] args) {
    	Scanner in = new Scanner (System.in);
    	int a[], b[], i, c;
    	a = new int [5];
    	b = new int [5];
    	
    	for (i=0; i<a.length; i++) {
    		System.out.println("Digite "+(i+1)+"° número:");
    		a[i] = in.nextInt();
    	}
    	for (i=0; i<a.length; i++) {
    		b[i] = 1;
    		
    		for (c=a[i]; c>0; c--) {
    			b[i] *=c;
    		}
    		if (a[i]==0) { b[i]=1; }
    		
    		System.out.println(a[i]+"! = "+b[i]);	
    		}
    	}
    	
    	
    	
    	
    	
    	
	}

