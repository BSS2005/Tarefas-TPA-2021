import java.util.Scanner;
public class ConversorKm {
	public static void main (String args[]) {
	 Scanner input = new Scanner(System.in);
	 
	 double m, km;
	 System.out.println("Insira o valor (em metros) a ser conbertido: ");
	 m = input.nextDouble();
	 km = m/1000;
	 System.out.println("O valor iserido("+m+" metros)se coverte para: "+km+"km");
	 input.close();
	

 }
}
