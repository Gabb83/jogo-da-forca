import java.util.Scanner;
import java.util.Random;

public class Main {
	
	static Scanner palavra = new Scanner(System.in);
	static Scanner numero = new Scanner(System.in);
	
	public static class SorteioPalavra {
		
		//todos os times do brasileirao serie A 
		private String[] bancoPalavra = { "flamengo", "vasco", "barcelona", "corinthians",
				"internacional", "fluminense", "fortaleza", "ceara",
				"ferroviario", "botafogo", "criciuma", "icasa", "sport",
				"gremio", "cruzeiro", "palmeiras", "santos", "avai", "goias",
				"coritiba", "figueirense", "bahia", "nautico", "parana", "abc",
				"bragantino", "sevilla", "oeste", "macae", "tolima" };
		
		public String sortearPalavra(){
			Random random = new Random();
			int indice = random.nextInt(bancoPalavra.length);
			return bancoPalavra[indice];
			
		}
	}
	
	public static void main(String[] args) {
		
		System.out.println("\n                JOGO DA FORCA\n");
		
//		System.out.println("Seja bem vindo ao jogo da forca!!");
//		System.out.print("Antes de começarmos digite seu nome: ");
//		String nome = palavra.next();
//		
//		System.out.printf("\nPrazer em conhecê-lo, %s!!", nome);
//		System.out.println("\nAgora vamos começar :D\n\n");
		
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
					
			        System.out.println("\nPalavra sorteada: " + palavraSorteada);
					break;
				}
				case 2:{
					
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
	}
	
	public static void jogar(String palavraSorteada) {
		
		System.out.println("\n                JOGO INICIADO\n\n");
		
		//0 erros
		System.out.println("+------------+");
		System.out.println("|            |");
		System.out.println("|            ");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("-                 ");
		
		System.out.print("Digite uma palavra: ");
		String chute = palavra.next();
		
		int i;
		for(i = 0; i < palavraSorteada.length(); i++) {
			System.out.printf("_ %s ", palavraSorteada.charAt(i));
		}
		
		System.out.print("_");
	}
	
	public static void boneco() {
		
		//1 erros
		System.out.println("+------------+");
		System.out.println("|            |");
		System.out.println("|          (x-x)");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("|");
		System.out.println("-");
		
		//2 erros
		System.out.println("+------------+");
		System.out.println("|            |");
		System.out.println("|          (x-x)");
		System.out.println("|            |");
		System.out.println("|            |");
		System.out.println("|");
		System.out.println("|");
		System.out.println("-");
		
		//3 erros
		System.out.println("+------------+");
		System.out.println("|            |");
		System.out.println("|          (x-x)");
		System.out.println("|           /|");
		System.out.println("|            |");
		System.out.println("|");
		System.out.println("|");
		System.out.println("-");
		
		//4 erros
		System.out.println("+------------+");
		System.out.println("|            |");
		System.out.println("|          (x-x)");
		System.out.println("|           /|\\");
		System.out.println("|            |");
		System.out.println("|");
		System.out.println("|");
		System.out.println("-");
		
		//5 erros
		System.out.println("+------------+");
		System.out.println("|            |");
		System.out.println("|          (x-x)");
		System.out.println("|           /|\\");
		System.out.println("|            |");
		System.out.println("|           /");
		System.out.println("|");
		System.out.println("-");
		
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
}