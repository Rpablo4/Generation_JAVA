

import java.util.Scanner;

public class lista3 {

	public static void main(String[] args) {
		while(true) {
				
				int op;
				Scanner leia = new Scanner(System.in) ;
				while(true) {
					System.out.println("\nQual quest�o voc� deseja visualizar? ");
					op = leia.nextInt();
					
					switch(op) {
						case 1:
							/*
							 * Fa�a um programa que possua um vetor denominado A que armazene 6 n�meros inteiros. O programa deve executar os seguintes passos: 
							(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7. 
							(b) Armazene em uma vari�vel inteira (simples) a soma entre os valores das posi��es A[0], A[1] e A[5] do vetor e mostre na tela esta soma. 
							(c) Modifique o vetor na posi��o 4, atribuindo a esta posi��o o valor 100. 
							(d) Mostre na tela cada valor do vetor A, um em cada linha.
	
							 */
							int A[]= {1, 0, 5, -2, 7};
							int soma,x;
							
							soma= A[0]+A[1]+A[5];
							System.out.println("\n O valor da soma �:"+soma);
							A[4]=100;
							for(x=0;x<6;x++) {
								System.out.println("\n"+A[x]);
							}
							break;
							
						case 2:
							/*
							 * Fa�a um programa que receba 6 n�meros inteiros e mostre: 
								� Os n�meros pares digitados;  
								� A soma dos n�meros pares digitados; 
								� Os n�meros �mpares digitados; 
								� A quantidade de n�meros �mpares digitados.
	
							 */
							int B[] = new int[6];
							int resto, somaPares=0,qtdImpar=0;
							for(x=0;x<6;x++) {
								System.out.println("\n Insira o"+(x+1)+"n�mero: ");
								B[x]=leia.nextInt();
							}
							System.out.println("\n N�meros Pares: ");
							for(x=0;x<6;x++) {
								resto=B[x]%2;
								if(resto==0) {
									System.out.println(" "+B[x]+", ");
									somaPares=somaPares+B[x];
								}
							}
							System.out.println("\n A soma dos n�meros pares � igual a: "+somaPares);
							System.out.println("\nOs n�meros �mpares s�o: ");
							for(x=0;x<6;x++) {
								resto=B[x]%2;
								if(resto!=0) {
									System.out.println(" "+B[x]+", ");
									qtdImpar++;
								}
							}
							System.out.println("A quantidade de n�meros impares inseridos foi: "+qtdImpar);
							break;
							
						case 3:
							//3- Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
							int matriz[][]=new int[3][3];
							int y, maiorQue10=0;
							for(x=0;x<3;x++) {
								for(y=0;y<3;y++) {
									System.out.println("\n Insira o valor para a posi��o "+x+"/"+y+": ");
									matriz[x][y]=leia.nextInt();
									if(matriz[x][y]>10) {
										maiorQue10++;
									}
								}
							}
							System.out.println("\n A matriz possui "+maiorQue10+" valores maiores que 10");
							break;
						
						case 4:
							/*
							 * Fa�a um programa que leia duas matrizes 2 x 2 com valores reais. Ofere�a ao usu�rio um menu de op��es:
							(1) somar as duas matrizes 
							(2) subtrair a primeira matriz da segunda 
							(3) adicionar uma constante as duas matrizes
							(4) imprimir as matrizes 
							Nas duas primeiras op��es uma terceira matriz 2 x 2 deve ser criada. Na terceira op��o o valor da constante deve ser lido e o resultado da adi��o da constante deve ser armazenado na pr�pria matriz.
	
							 */
							float matrizA[][]=new float[2][2];
							float matrizB[][]=new float[2][2];
							float matrizR[][]=new float[2][2];
							float constante;
							int option;
							
							
							System.out.println("\nEscolha uma op��o:\n(1) somar as duas matrizes \r\n"
									+ "(2) subtrair a primeira matriz da segunda \r\n"
									+ "(3) adicionar uma constante as duas matrizes\r\n"
									+ "(4) imprimir as matrizes ");
							option=leia.nextInt();
							switch(option) {
							
								case 1:
									for(x=0;x<2;x++) {
										for(y=0;y<2;y++) {
											matrizR[x][y]=matrizA[x][y]+matrizB[x][y];
										}
									}
									break;
								case 2:
									for(x=0;x<2;x++) {
										for(y=0;y<2;y++) {
											matrizR[x][y]=matrizA[x][y]-matrizB[x][y];
										}
									}
									break;
								case 3:
									System.out.println("\n Insira o valor da constante: ");
									constante=leia.nextFloat();
									for(x=0;x<2;x++) {
										for(y=0;y<2;y++) {
											matrizA[x][y]=matrizA[x][y]+constante;
											matrizB[x][y]=matrizB[x][y]+constante;
										}
									}
									break;
								case 4: 
									System.out.println("\nMatriz A:");
									for(x=0;x<2;x++) {
										for(y=0;y<2;y++) {
											System.out.println(" "+matrizA[x][y]+", ");
										}
										System.out.println("\n");
									}
									System.out.println("\nMatriz B:");
									for(x=0;x<2;x++) {
										for(y=0;y<2;y++) {
											System.out.println(" "+matrizB[x][y]+", ");
										}
										System.out.println("\n");
									}
									break;
							}
							break;
							default:
								System.out.println("\n Op��o invalida. Tente novamente com um n�mero de 1 a 4.");
							
				}
			}
	}

}
}
