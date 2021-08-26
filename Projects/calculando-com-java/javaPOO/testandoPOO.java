package javaPOO;

import java.util.Scanner;

public class testandoPOO {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		classesTestando ct = new classesTestando();

		String pergunta = "s";

		while (!(pergunta.equalsIgnoreCase("n"))) {

			ct.opcoes();
			ct.pegandoNumeros();

			if (ct.opcao == 1) {
				ct.soma(ct.numero1, ct.numero2);
			} else if (ct.opcao == 2) {
				ct.subtrair(ct.numero1, ct.numero2);
			} else if (ct.opcao == 3) {
				ct.dividir(ct.numero1, ct.numero2);
			} else if (ct.opcao == 4) {
				ct.multiplicar(ct.numero1, ct.numero2);
			}

			System.out.println("Deseja continuar? (S/N)");
			pergunta = entrada.next();
		}
		
		System.out.println("Acabou");
	}

}
