package javaPOO;

import java.util.Scanner;

public class classesTestando {
	
	Scanner entrada = new Scanner (System.in);
	int numero1, numero2;
	int opcao;
		
	void opcoes() {
		System.out.println("1 - Somar");
		System.out.println("2 - Subtrair");
		System.out.println("3 - Dividir");
		System.out.println("4 - Multiplica��o");
		System.out.print("Op��o: ");
		opcao = entrada.nextInt();
	}
	
	void pegandoNumeros() {
		System.out.println("Digite o n�mero 1: ");
		numero1 = entrada.nextInt();
		
		System.out.println("Digite o n�mero 2: ");
		numero2 = entrada.nextInt();
	}
	
	void soma(int num1, int num2) {
		System.out.println("O resultado da soma �: "+ (num1+num2));
	}
	
	void subtrair(int num1, int num2) {
		System.out.println("O resultado da subtra��o �: "+ (num1-num2));
	}
	
	void dividir(int num1, int num2) {
		System.out.println("O resultado da divis�o �: "+ (num1/num2));
	}
	
	void multiplicar(int num1, int num2) {
		System.out.println("O resultado da multiplica��o �: "+ (num1*num2));
	}

}
