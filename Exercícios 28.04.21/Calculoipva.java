import java.util.Scanner;
public class Calculoipva {
   public static void main (String args[]) {
	   Scanner input = new Scanner(System.in);
	   
	   double valor, ipva;
	   System.out.println("Insira valor do veículo: ");
	   valor = input.nextDouble();
	   ipva = (4*valor)/100;
	   System.out.println("O IPVA do veículo é: R$"+ipva);
	   input.close();
   }
}
