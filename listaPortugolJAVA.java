package familia52;

import java.util.Scanner;

public class listaPortugolJAVA {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in) ;
		int questao, ano, mes, dia, idadeEmDias;
		
		while(true){
		System.out.println("\nDigite o numero da questao que voce deseja visualizar: ");
		questao=leia.nextInt();
		dia=0;
		switch(questao){
		case 1:		
			System.out.println("\n##### QUESTAO 1 #####\n");
			System.out.println("\nInsira o ano em que você nasceu: ");
			ano=leia.nextInt();
			System.out.println("\nDigite o mes em que voce nasceu: ");
			mes=leia.nextInt();
			System.out.println("\n Insira o dia em que voce nasceu: ");
			dia= leia.nextInt();
	
			idadeEmDias=(((2021-ano)*365)+(mes*30)+dia);
			System.out.println("\nA sua idade em dias e: "+idadeEmDias);
			break;
			
		case 2: 
			System.out.println("\n##### QUESTAO 2 #####\n");
			System.out.println("\nInsira sua idade em dias: ");
			idadeEmDias=leia.nextInt();

			ano = (idadeEmDias/365);
			mes = ((idadeEmDias-(ano*365))/30);
			dia = idadeEmDias-(ano*365+mes*30);

			System.out.println("\nVoce tem: "+ ano+ " anos, "+ mes+ " meses e "+ dia+ " dias");
			break;
			
		case 3:
			int tempoDeDuracaoEmSegundos, horas, minutos, segundos;
			System.out.println("\n##### QUESTAO 3 #####\n");
			System.out.println("\nInsira o tempo de duração do evento em segundos: ");
			tempoDeDuracaoEmSegundos = leia.nextInt();
			horas=(tempoDeDuracaoEmSegundos/60)/60;
			minutos=((tempoDeDuracaoEmSegundos/60)-(horas*60));
			segundos=(tempoDeDuracaoEmSegundos/60)%60;

			System.out.println("o evento durou: "+ horas+ " horas, "+ minutos+" minutos e "+ segundos+ " segundos.");
			break;
			
		case 4:
			int a, b, c, r, s, d;
			System.out.println("\n##### QUESTAO 4 #####\n");
			System.out.println("\nDigite um valor para a: ");
			a=leia.nextInt();
			System.out.println("\nDigite um valor para b: ");
			b=leia.nextInt();
			System.out.println("\nDigite um valor para c: ");
			c=leia.nextInt();
			r=(a*a+2*a*b+b*b);
			s=(b*b+2*b*c+c*c);
			d=((r+s)/2);
			System.out.println("O resultado e: "+ d);
			break;
			
		case 5:
			float nota1, nota2, nota3, media;
			System.out.println("\n##### QUESTAO 5 #####\n");
			System.out.println("\nDigite o valor da nota 1: ");
			nota1=leia.nextFloat();
			System.out.println("\nDigite o valor da nota 2: ");
			nota2=leia.nextFloat();
			System.out.println("\nDigite o valor da nota 3: ");
			nota3=leia.nextFloat();

			media=(2*nota1+3*nota2+5*nota3)/10;
			System.out.println("\nA sua media e: "+ media);
			break;
			
		case 6:
			double x1, x2, y1, y2, resultado, x, y;
			System.out.println("\n##### QUESTAO 6 #####\n");
			System.out.println("\nDigite a cordenada x do ponto 1: ");
			x1=leia.nextFloat();
			System.out.println("\nDigite a cordenada y do ponto 1: ");
			y1=leia.nextFloat();
			System.out.println("\nDigite a cordenada x do ponto 2: ");
			x2=leia.nextFloat();
			System.out.println("\nDigite a cordenada y do ponto 2: ");
			y2=leia.nextFloat();
			
			x=(x2*x2-2*x2*x1+x1*x1);
			y=(y2*y2-2*y2*y1+y1*y1);

			resultado=Math.sqrt((x+y));
			
			System.out.println("\nO resultado e: "+resultado);
			break;
			
		case 7:
			int w1, s1, a1, b1, c1, d1, f1, e1;
			System.out.println("\n##### QUESTAO 7 #####\n");
			System.out.println("\nDigite o valor de a: ");
			a1= leia.nextInt();
			System.out.println("\nDigite o valor de b: ");
			b1=leia.nextInt();
			System.out.println("\nDigite o valor de c: ");
			c1=leia.nextInt();
			System.out.println("\nDigite o valor de d: ");
			d1=leia.nextInt();
			System.out.println("\nDigite o valor de e: ");
			e1=leia.nextInt();
			System.out.println("\nDigite o valor de f: ");
			f1=leia.nextInt();
			
			w1= (c1*e1-b1*f1)/(a1*e1-b1*d1);
			s1= (a1*f1-c1*d1)/(a1*e1-b1-d1);

			System.out.println("\n O valor de x e: "+ w1+ "\n O valor de y e: "+ s1);
			break;
			
		case 8:
			double custoDeFabrica, custoAoConsumidor;
			System.out.println("\n##### QUESTAO 8 #####\n");
			System.out.println("\nDigite o custo de fabrica do carro: ");
			custoDeFabrica=leia.nextInt();
			custoAoConsumidor = (custoDeFabrica + custoDeFabrica * 0.28 + custoDeFabrica *0.45);
			System.out.println("\nO seu carro vai custar: R$"+custoAoConsumidor);
		}
		}
	}
}
