import java.util.Scanner;
public class NomeIdMaiorMenor {
	public static void main (String args []) {
		Scanner in = new Scanner (System.in);
		String nMaior, nMenor, n;
		int idMaior, idMenor,id;
		System.out.println("Digite o primeiro nome:");
		n = in.next();
		System.out.println("Digite a primeira idade:");
		id = in.nextInt();
		nMaior = n;
		idMaior = id;
		nMenor = n;
		idMenor = id;
		
		System.out.println("Digite o segundo nome:");
		n = in.next();
		System.out.println("Digite a segunda idade:");
		id = in.nextInt();
		if (id>idMaior) {
			nMaior = n;
			idMaior = id;
		}else if (id<idMenor) {
			nMenor = n;
			idMenor = id;
		}
		System.out.println("Digite o terceiro nome:");
		n = in.next();
		System.out.println("Digite a terceira idade:");
		id = in.nextInt();
		if (id>idMenor) {
			nMenor = n;
			idMenor = id;
		}else if (id<idMaior) {
			nMaior = n;
			idMaior = id;
		}
		System.out.println("Digite o quarto nome:");
		n = in.next();
		System.out.println("Digite o quarta idade:");
		id = in.nextInt();
		if (id<idMaior) {
			nMaior = n;
			idMaior = id;
		}else if (id<idMaior) {
			nMaior = n;
			idMaior = id;
		}
		System.out.println("Digite o quinto nome:");
		n = in.next();
		System.out.println("Digite o quinta idade:");
		id = in.nextInt();
		if (id<idMaior) {
			nMaior = n;
			idMaior = id;
		}else if (id<idMaior) {
			nMaior = n;
			idMaior = id;
		}
		System.out.println("O mais velho tem "+idMaior);
		System.out.println("O nome do usu�rio mais velho �:"+nMaior);
		System.out.println("O mais novo tem "+idMenor);
		System.out.println("O nome do usu�rio mais novo �:"+nMenor);
		in.close();
	}

}
