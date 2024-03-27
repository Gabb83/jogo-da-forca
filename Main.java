import java.util.Scanner;
import java.util.Random;

public class Main {

	static Scanner palavra = new Scanner(System.in);
	static Scanner numero = new Scanner(System.in);

	public static class SorteioPalavra {

		//todos os times do brasileirao serie A 
		private String[] bancoPalavra = {"vasco", };

		public String sortearPalavra(){
			Random random = new Random();
			int indice = random.nextInt(bancoPalavra.length);
			return bancoPalavra[indice];

		}
	}

	public static void main(String[] args) {

		System.out.println("\n                JOGO DA FORCA\n");

	    System.out.println("Seja bem vindo ao jogo da forca!!");
        System.out.print("Antes de começarmos digite seu nome: ");
		String nome = palavra.next();

	   System.out.printf("\nPrazer em conhecê-lo, %s!!", nome);
	   System.out.println("\nAgora vamos começar :D\n\n");

		int loop_principal;

		do {

			System.out.println("+--------------------------------------------+");
			System.out.println("|                MENU PRINCIPAL              |");
			System.out.println("+--------------------------------------------+");
			System.out.println("|        1 - Iniciar                         |");
			System.out.println("|        2 - Intruções                       |");
			System.out.println("|        3 - Ver créditos                    |");
			System.out.println("|        4 - Encerrar jogo                   |");
			System.out.println("+--------------------------------------------+");

			System.out.print("Selecione uma das opções acima: ");
			int menu = numero.nextInt();

			switch(menu) {
				case 1:{
			        SorteioPalavra sorteio = new SorteioPalavra();
			        String palavraSorteada = sorteio.sortearPalavra();

					jogar(palavraSorteada);
					break;
				}
				case 2:{	
					//mostra as intrucoes
					intrucoes();
					
					break;
					
				}
				case 3:{
					//mostra os creditos
					creditos();

					break;
				}
				case 4:{
					//encerra o jogo

					break;
				}
				default:{
					System.out.println("\nOpção inválida");
					System.out.println("Tente novamente");

					break;
				}
			}

			if(menu == 4) {
				break;
			}

			System.out.println("\nDeseja voltar ao menu principal?");
			System.out.println("1 - para sim || 2 - para não");
			loop_principal = numero.nextInt();

		} while(loop_principal == 1);

		System.out.println("\nParece que você chegou ao fim");
		//System.out.printf("Obrigado por jogar, %s!!!", nome);
		
		palavra.close();
		System.exit(0);
	}

	public static void jogar(String palavraSorteada) {

		System.out.println("\n                JOGO INICIADO\n\n");


		int i;
		int tentativa = 1;

		for(i = 0; i < 7; i++){
			
			switch (tentativa) {
			    case 1:{
			    	boneco1();
			    	break;
			    }  
			    case 2:{
			    	boneco2();
			        break;	
			    }
			    case 3:{
			    	boneco3();
			        break;
			    }
			    case 4:{
			    	boneco4();
			        break;
			    }  
			    case 5:{
			    	boneco5();
			        break;
			    }
			    case 6:{
			    	boneco6();
			        break;
			    }
			    case 7:{
			    	boneco7();
			        break;
			    }   
			}

		    System.out.printf("\nEssa é sua tentativa número: %d", tentativa);
		    System.out.println("\nDigite uma letra: ");
		    String chute = palavra.next();
//		    		    
//		    if(tentativa == 6){
//		        System.out.println("Você perdeu");
//		        System.out.println("A palavra sorteada era: " + palavraSorteada);
//		        
//		    } else if(chute == palavraSorteada){
//		        System.out.println("Você acertou" + palavraSorteada);
//		        break;
//		        
//		    } else{
//		        System.out.println("Você errou");
//		        tentativa++;
//		    }

		    for(i = 0; i < palavraSorteada.length(); i++) {
         
	        	 if(chute.equals(palavraSorteada)) {
	        		System.out.println("\nParabéns, você ganhou");
	      	        System.out.println("A palavra sorteada era: " + palavraSorteada);
	
	        	 } else if(chute.charAt(i) == palavraSorteada.charAt(i)) {
	        		 System.out.println("\nAcertou a letra");
	
	        	 } else if(tentativa == 7){
	    	        System.out.println("\nVocê perdeu");
	     	        System.out.println("A palavra sorteada era: " + palavraSorteada);
	
	        	 } else {
	        		 System.out.println("\nVocê errou");
	        		 tentativa++;
	        	 }

	        	 break;
		    }
		}
	}

	public static void boneco1() {
        //0 erros
		System.out.println("+------------+");
		System.out.println("|            |");
		System.out.println("|            ");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("-                 ");
	}

	public static void boneco2() {
	    //1 erros
		System.out.println("+------------+");
		System.out.println("|            |");
		System.out.println("|          (x-x)");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("-");

	}

	public static void boneco3() {
	    //2 erros
		System.out.println("+------------+");
		System.out.println("|            |");
		System.out.println("|          (x-x)");
		System.out.println("|            |");
		System.out.println("|            |");
		System.out.println("|");
		System.out.println("|");
		System.out.println("-");
	}

	public static void boneco4(){
	    //3 erros
		System.out.println("+------------+");
		System.out.println("|            |");
		System.out.println("|          (x-x)");
		System.out.println("|           /|");
		System.out.println("|            |");
		System.out.println("|");
		System.out.println("|");
		System.out.println("-");
	}

	public static void boneco5(){
	    		//4 erros
		System.out.println("+------------+");
		System.out.println("|            |");
		System.out.println("|          (x-x)");
		System.out.println("|           /|\\");
		System.out.println("|            |");
		System.out.println("|");
		System.out.println("|");
		System.out.println("-");
	}

	public static void boneco6(){
	    //5 erros
		System.out.println("+------------+");
		System.out.println("|            |");
		System.out.println("|          (x-x)");
		System.out.println("|           /|\\");
		System.out.println("|            |");
		System.out.println("|           /");
		System.out.println("|");
		System.out.println("-");
	}

	public static void boneco7(){
	    //6 erros ou game over
		System.out.println("+------------+");
		System.out.println("|            |");
		System.out.println("|          (x-x)");
		System.out.println("|           /|\\");
		System.out.println("|            |");
		System.out.println("|           / \\");
		System.out.println("|");
		System.out.println("-");
	}

	public static void creditos() {

		System.out.println("\n\n                JOGO DA FORCA\n");

		System.out.println("+--------------------------------------------+");
		System.out.println("|               DESENVOLVEDORES              |");
		System.out.println("+--------------------------------------------+");
		System.out.println("|             Gabriel Evangelista            |");
		System.out.println("|                 João Vitor                 |");
		System.out.println("+--------------------------------------------+\n");
	}
	
	public static void intrucoes() {
		
		System.out.println("\n\n                JOGO DA FORCA\n");
		
		System.out.println("O jogo da forca, é com o tema de nomes dos times de futebol da serie A do brasileirão 2024\n"
				+ "Você terá 6 chaces para adinvinhar as letras da palava sorteada");
		
	}
}