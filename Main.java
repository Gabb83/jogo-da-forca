import java.util.Scanner;
import java.util.Random;

public class Main {
	
	//Scanners usados para numeros ou letras
    static Scanner palavra = new Scanner(System.in);
    static Scanner numero = new Scanner(System.in);

    public static class SorteioPalavra {

        //todos os times do brasileirao serie A 2024
        private String[] bancoPalavra = {"vasco", "flamengo", "corinthians", "palmeiras", "santos", "bahia", "fluminense",
        		"cruzeiro", "cuiaba", "criciuma", "fortaleza", "juventude", "bragantino", "vitoria", "internacional", "sao-paulo",
        		"atletico-mineiro", "atletico-goianiense", "atletico-paranaense", "gremio"};

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
                	//faz o sorteio de uma nova palavra a cada loop
                    SorteioPalavra sorteio = new SorteioPalavra();
                    String palavraSorteada = sorteio.sortearPalavra();

                    jogar(palavraSorteada, nome);
                    break;
                }
                case 2:{
                	//chama a classe instrucoes
                	instrucoes();
                	
                    break;
                }
                case 3:{
                    //chama a classe creditos
                    creditos();

                    break;
                }
                case 4:{
                    //encerra o jogo

                    break;
                }
                default:{
                	//caso o usuario nao digite uma opcao valida
                    System.out.println("\nOpção inválida");
                    System.out.println("Tente novamente");

                    break;
                }
            }
            
            /*caso o usuario tenha digitado para sair essa condicao
            ja quebra o loop para que nao seja preciso fazer a verificacao*/
            if(menu == 4) {
                break;
            }
            
            //texto exibido se o usuario deseje voltar ao menu
            System.out.println("\nDeseja voltar ao menu principal?");
            System.out.println("1 - para sim || 2 - para não");
            loop_principal = numero.nextInt();
            
            System.out.println();

        } while(loop_principal == 1);

        System.out.println("Você chegou ao fim");
        //System.out.printf("Obrigado por jogar, %s!!!", nome);

        palavra.close();
    }

    public static void jogar(String palavraSorteada, String nome) {

        System.out.println("\n                JOGO INICIADO\n\n");

        int tentativa = 0;
        boolean[] letrasAcertadas = new boolean[palavraSorteada.length()]; // Array para controlar as letras acertadas

        while (tentativa < 7 && !palavraCompleta(letrasAcertadas)) {
            // Exibir a palavra com as letras ocultas
            for (int i = 0; i < palavraSorteada.length(); i++) {
                if (letrasAcertadas[i]) {
                    System.out.print(palavraSorteada.charAt(i) + " ");
                } else {
                    System.out.print("_ ");
                }
            }

            System.out.printf("\nEssa é sua tentativa número: %d\n", tentativa + 1);
            System.out.println("Digite uma letra: ");
            String chute = palavra.next();

            boolean acertou = false;

            for (int i = 0; i < palavraSorteada.length(); i++) {
                if (chute.equalsIgnoreCase(String.valueOf(palavraSorteada.charAt(i)))) {
                    letrasAcertadas[i] = true;
                    acertou = true;
                }
            }

            if (!acertou) {
                tentativa++;
                // Chamar método para exibir o boneco correspondente à quantidade de erros
                exibirBoneco(tentativa);
            }
        }
        
        //verificao se o usuario ganhou || perdeu
        if (palavraCompleta(letrasAcertadas)) {
            System.out.printf("\nParabéns, %s você ganhou!\n", nome);
            System.out.println("a palavra sorteada era: " + palavraSorteada);
        } else {
            System.out.println("\nVocê perdeu!");
            System.out.println("A palavra sorteada era: " + palavraSorteada);
        }
    }

    // Método para verificar se todas as letras foram acertadas
    public static boolean palavraCompleta(boolean[] letrasAcertadas) {
        for (boolean acertou : letrasAcertadas) {
            if (!acertou) {
                return false;
            }
        }
        return true;
    }

    // Método para exibir o boneco conforme os erros
    public static void exibirBoneco(int tentativa) {
        switch (tentativa) {
            case 1:
                boneco1();
                break;
            case 2:
                boneco2();
                break;
            case 3:
                boneco3();
                break;
            case 4:
                boneco4();
                break;
            case 5:
                boneco5();
                break;
            case 6:
                boneco6();
                break;
            case 7:
                boneco7();
                break;
        }
    }
    
    //colecao de classes que mostra o desenvolvimento do boneco da forca
    public static void boneco1() {
        //0 erros
        System.out.println("+------------+");
        System.out.println("|            |");
        System.out.println("|            ");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("|");
        System.out.println("-");
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
        //7 erros ou game over
        System.out.println("+------------+");
        System.out.println("|            |");
        System.out.println("|          (x-x)");
        System.out.println("|           /|\\");
        System.out.println("|            |");
        System.out.println("|           / \\");
        System.out.println("|");
        System.out.println("-");
    }
    public static void instrucoes() {
    	//classe das instrucoes do jogo
    	
        System.out.println("\n\n                JOGO DA FORCA\n");
    	
        System.out.println("O jogo da forca, é com nomes de times do brasileirão serie A 2024"
        		+ " \nVocê terá 7 chances para adinvinhar as letras dessa palavra\n");
        System.out.println("Dicas: \n"
        		+ "1) todos os times devem ser escritos em letra minúscula\n"
        		+ "2) os times que tiverem nomes compostos devem utilizar o hífen (-) como separador\n"
        		+ "3) não é necessário fazer o uso de acentos durante o jogo\n");

    }
    public static void creditos() {
    	//classe dos creditos do jogo

        System.out.println("\n\n                JOGO DA FORCA\n");

        System.out.println("+--------------------------------------------+");
        System.out.println("|               DESENVOLVEDORES              |");
        System.out.println("+--------------------------------------------+");
        System.out.println("|             Gabriel Evangelista            |");
        System.out.println("|                 João Vitor                 |");
        System.out.println("+--------------------------------------------+\n");
    }
}