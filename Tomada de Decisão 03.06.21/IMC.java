import java.util.Scanner;
public class IMC {
    public static void main(String args[]) {
	  Scanner in=new Scanner (System.in);
      double kg, m,imc;	
	  System.out.println("Entre com seu peso:");
	  kg = in.nextDouble();
	  System.out.println("Entre com sua altua:");
	  m = in.nextDouble();
	  imc = kg/(m*m);
	  System.out.println("Seu IMC é:"+Math.round(imc));
	  if (imc<=18.5) {
	      System.out.println("Excesso de magreza.");
	  }else if (imc>=18.5 && imc<25) {
		  System.out.println("Peso normal.");
	  }else if (imc>=25 && imc<30) {	  
		  System.out.println("Excesso de peso.");
	  }else if (imc>=30 && imc<35) {
	      System.out.println("Obesidade 1 Grau.");
      }else if (imc>=35 && imc<40) {     
		  System.out.println("Obesidade 2 Grau.");
      }else {
    	  System.out.println("Obesidade 3 Grau.");
		  
	  }
	
   }
}
