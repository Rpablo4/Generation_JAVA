package familia52;

import java.util.Scanner;

public class lista1 {

	public static void main(String[] args) {
		while(true) {
			int op;
			Scanner leia = new Scanner(System.in) ;
			System.out.println("\nQual questão você deseja visualizar? ");
			op = leia.nextInt();
			
			switch(op) {
			case 1:
				/*
				 * Faça um programa que receba três inteiros e diga qual deles é o maior.
				 */
				int n1,n2,n3;
				
					System.out.println("\nEntre com o primeiro inteiro: ");
					n1 = leia.nextInt();
					System.out.println("\nEntre com o segundo inteiro: ");
					n2 = leia.nextInt();
					System.out.println("\nEntre com o terceiro inteiro: ");
					n3 = leia.nextInt();
				
				if(n1>n2 && n1>n3)
					System.out.println("O maior inteiro é: "+n1);
				if(n2>n1 && n2>n3)
					System.out.println("O maior inteiro é: "+n2);
				if(n3>n1 && n3>n2)
					System.out.println("O maior inteiro é: "+n3);
				else
					System.out.println("Você digitou dois inteiros iguais");
				
				
				break;
			
			case 2:
				/*
				 * Faça um programa que receba três inteiros e diga qual deles é o maior.
				 */
				int maior, menor, meio;
				System.out.println("\nEntre com o primeiro numero: ");
				n1 = leia.nextInt();
				System.out.println("\nEntre com o segundo numero: ");
				n2 = leia.nextInt();
				if(n1>=n2) {
					maior=n1;
					meio=n2;
				}
				else {
					maior=n2;
					meio=n1;
				}
				System.out.println("\nEntre com o terceiro numero: ");
				n3 = leia.nextInt();
				if(n3>=maior) {
					menor=meio;
					meio=maior;
					maior=n3;
				}
				else if(n3>=meio && n3<maior){
					menor=meio;
					meio=n3;
				}
				else 
					menor=n3;
				System.out.println("\nA ordem crescente é: "+menor+", "+meio+", "+maior);
				
				break;
			
			case 3:
				/*
				 * Faça um programa que receba a idade de uma pessoa e mostre na saída em qual categoria ela se encontra:
					10-14 infantil
					15-17 juvenil
					18-25 adulto

				 */
				int idade;
				System.out.println("\nQuantos anos você tem? ");
				idade = leia.nextInt();
				if(idade>=10 && idade<=14)
					System.out.println("\n Categoria Infantil");
				if(idade>=15 && idade<=17)
					System.out.println("\n Categoria Juvenil");
				if(idade>=18)
					System.out.println("\nCategoria Adulto");
				break;
				
			case 4:
				/*
				 * Faça um programa em que permita a entrada de um número qualquer e exiba se este número é par ou ímpar. 
				 * Se for par exiba também a raiz quadrada do mesmo; se for ímpar exiba o número elevado ao quadrado.
				 */
				int randomNum;
				double teste, raiz,aoQuad;
				System.out.println("\nDigite um numero inteiro: ");
				randomNum = leia.nextInt();
	
				teste = randomNum%2;
				if(teste==0) {
					raiz = Math.sqrt(randomNum);
					System.out.println("\n Par! A raiz quadrada é: "+raiz);
				}
				else {
					aoQuad=Math.pow(randomNum,2);
					System.out.println("\n Impar! O quadrado do número é: "+aoQuad);
				}
				break;
			default:
				System.out.println("\nSó há quatro questões. Tente novamente!4");
			}
		}	
	}

}


