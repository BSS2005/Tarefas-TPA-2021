import java.util.Scanner;
public class Desconto {
  public static void main (String args[]) {
	  Scanner input = new Scanner(System.in);
	  
	  float valor, desc, valordesc, valorf;
	  System.out.println("Insira o valor do produto: ");
	  valor = input.nextFloat();
	  System.out.println("Isira o desconto desejado: ");
	  desc = input.nextFloat();
	  valordesc = (desc*valor)/200;
	  valorf = valor-valordesc;
	  System.out.printf("O valor do produto com o desconto aplicado ser�: R$.2f", (valorf));
	   input.close();
	  
  }
}
