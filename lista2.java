package familia52;

import java.util.Scanner;

public class lista2 {

	public static void main(String[] args) {
		
		while(true) {
			
			int op;
			Scanner leia = new Scanner(System.in) ;
			System.out.println("\nQual questão você deseja visualizar? ");
			op = leia.nextInt();
			
			switch(op) {
				case 1:
					/*
					 *  Informar todos os números de 1000 a 1999 que quando divididos por 11
						obtemos resto = 5. (FOR)
					 * 
					 */
					
					int resto, x, cont;
					for(x=1000; x<=1999; x++) {
						resto=(x%11);
						if(resto==5) {
							System.out.println("\n"+x);
						}
					}
					break;
					
				case 2:
					/*
					 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
					 */
					
					int num, impares=0, pares=0;
					
					for(x=0;x<=9;x++) {
						System.out.printf("\n Insira o %dº número inteiro: ", x+1);
						num=leia.nextInt();
						resto=num%2;
						if(resto==0) 
							pares++;
						else 
							impares++;
					}
					System.out.println("\n"+pares+" deles são pares!");
					System.out.println("\n"+impares+" deles são impares!");
					break;
				
				case 3:
					/*
					 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
					21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
					idade for =-99. (WHILE)
					 */
					int idade=0, menos21=0, mais50=0;
					x=0;
					System.out.println("\n Digite -99 para ver o resultado.");
					while(idade!=-99) {
						System.out.printf("\n Insira a %dº idade: ", x+1);
						idade=leia.nextInt();
						x++;
						if(idade<21 && idade>0)
							menos21++;
						else if(idade>50 && idade>0)
							mais50++;
						else
							System.out.println("\n Idade invalida");
					}
					System.out.println("\n"+menos21+" pessoas tem menos de 21 anos de idade.");
					System.out.println("\n"+mais50+" pessoas tem mais de 50 anos de idade.");
					break;
					
				case 4:
					/* 
					 * Uma empresa desenvolveu uma pesquisa para saber as características
						psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
						era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
						(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
						agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
						pessoas, calcule e mostre: (WHILE)
						- número de pessoas calmas;
						- número de mulheres nervosas;
						- número de homens agressivos;
						- número de outros calmos;
						- número de pessoas nervosas com mais de 40 anos;
						- número de pessoas calmas com menos de 18 anos.
					 */
					int nIndividuosCalmos=0, sexo=0, personality=0, nMulheresEstressadas=0, nHomensAgressivos=0, nNaoBinarioCalmxs=0, nervousAbove40=0, calmUnder20=0;
					x=0;
					while(x<=3) {
						System.out.printf("\n ###INDIVÍDUO %d###", x+1);
						x++;
						while(true) {
							System.out.println("\n Digite a sua idade: ");
							idade=leia.nextInt();
							if(idade>130 || idade<0) 
								System.out.println("\n Idade inválida, tente novamente./");
							else 
								break;
						}
						while(true) {
							System.out.println("\n Digite o seu sexo: (1-feminino / 2-masculino / 3-Não Binario),");
							sexo=leia.nextInt();
								
							if(sexo>4 || sexo<0)
								System.out.println("\n Opção inválida, tente novamente.");
							else
								break;
						}
						while(true) {
							System.out.println("\n Você se considera uma pessoa: 1-calma; 2-nervosa e 3-agressiva");
							personality=leia.nextInt();
									
							if(personality<0 || personality>4)
								System.out.println("\n Opção inválida, tente novamente.");
								else
									break;
						}
								
							
							
							
						
						
						if(personality==1)
							nIndividuosCalmos++;
						if(sexo==1 && personality==2)
							nMulheresEstressadas++;
						if(sexo==2 && personality==3)
							nHomensAgressivos++;
						if(sexo==3 && personality==1)
							nNaoBinarioCalmxs++;
						if(personality==2 && idade>40)
							nervousAbove40++;
						if(personality==1 && idade<20)
							calmUnder20++;
						
					}
					System.out.println("\nNúmero de pessoas calmas: "+nIndividuosCalmos);
					System.out.println("\nNúmero de mulheres estressadas: "+nMulheresEstressadas);
					System.out.println("\nNúmero de homens agressivos: "+nHomensAgressivos);
					System.out.println("\nNúmero de pessoas não binárias calmas: "+nNaoBinarioCalmxs);
					System.out.println("\nNúmero de pessoas nervosas acima dos 40 anos: "+nervousAbove40);
					System.out.println("\nNúmero de pessoas calmas abaixo dos 20 anos:"+calmUnder20);
					
					break;
				
				case 5:
					/* 
					 * Crie um programa que leia um número do teclado até que encontre um
						número igual a zero. No final, mostre a soma dos números
						digitados.(DO...WHILE)
					 */
					int total=0;
					do {
					System.out.println("\n Entre com um número do teclado: ");
					num=leia.nextInt();
					total=total+num;
					}while(num!=0);
					System.out.println("\n A soma dos números digitados é: "+total);
					break;
				
				case 6:
					/*
					 * Escrever um programa que receba vários números inteiros no teclado. E no
						final imprimir a média dos números múltiplos de 3. Para sair digitar
						0(zero).(DO...WHILE)
					 */
					float divPorTres=0, media;
					x=0;
					do {
						x++;
						System.out.println("\n Entre com um número inteiro(Digite 0 para sair): ");
						num=leia.nextInt();
						resto=num%3;
						if(resto==0)
							divPorTres++;
						media=(divPorTres/x);
						}while(num!=0);
					System.out.println("\n A média de números divisiveis por trÊs é: "+media*100+"%");
			}
			
		}

	}

}
