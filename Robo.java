import java.util.Scanner;

public class Robo {
    public static void option0() {
        System.out.println("Fim"+"\n");
    }

    public static void option1() {
        Scanner input = new Scanner(System.in);      
        System.out.println("Nome: "+"\n");               //Leitura do Nome da Pessoa
        String nome = input.nextLine();
    
        System.out.println("Idade: "+"\n");             //Leitura da Idade da Pessoa
        int idade = input.nextInt();
    
        if (idade < 12) {
            System.out.println("Não precisam de autorização: quando viajam acompanhadas de pelo menos um dos pais, um responsável legal ou um parente com grau de parentesco até o terceiro grau (irmãos maiores de idade, tios e avós)." +
                "Nesses casos, o acompanhante deve levar o original ou a cópia autenticada da certidão de nascimento ou do RG da criança, além de documentação que comprove a filiação ou relação de parentesco com ela." +
                "Precisam de autorização com firma reconhecida em cartório: para viajarem em território nacional acompanhadas de adultos que não sejam seus pais, responsáveis ou parentes de até terceiro grau, não importando o meio de transporte." +
                "Ou seja, a autorização é necessária para voos domésticos, viagens em ônibus interestadual e até viagens de carro, em caso de eventualidade. Deve ser acompanhada por original ou cópia da certidão de nascimento ou do RG da criança.\n");    
        }
        else if (idade >= 12 || idade < 18) {
            System.out.println("Não precisam de autorização de qualquer tipo para viajar pelo território nacional, desacompanhados ou não e em qualquer meio de transporte." +
                "É obrigatória a apresentação de original ou cópia autenticada do RG para viagens em ônibus interestaduais ou em voos domésticos, ainda que o adolescente esteja acompanhado pelos pais. Apenas a certidão de nascimento não basta.\n");    
        } 
        else {
            System.out.println("Basta apresentar documento oficial com foto para comprovar sua identidade"+"\n");        
        }
    }

    public static void option2() {
        Scanner input = new Scanner(System.in);
        System.out.println("Digite sua nota preliminar na disciplina");     //Leitura da nota do Aluno
        int nota = input.nextInt();
    	
    	System.out.println("Digite seu número de faltas na disciplina");     //Leitura do número de faltas do Aluno
        int faltas = input.nextInt();
    	
    	int maxFaltas = 10;  // Limite máximo que aluno pode faltar
    	
    	if (nota > 7 && faltas < maxFaltas) {
    		System.out.println("Aprovado: "+ nota+"\n");
    	}
    	if (nota >= 4 || nota <= 7 && faltas < maxFaltas) { 
    		System.out.println("Prova Final: "+ nota +"\n");
    	}
    	else {
    		System.out.println("Reprovado: "+ nota +"\n");
    	}
    }
	public static void main(String[] args) {
	    Scanner input = new Scanner(System.in);
        System.out.println("Digite uma das opções à seguir para lhe responder o que desejas:\n" +
        "Opção 0: Sair;\n" +
        "Opção 1: Passe-me seu nome/idade e lhe direi quais exigências para viajar de Ônibus Interestadual;\n" +
        "Opção 2: Diga-me sua nota PRELIMINAR do semestre (antes da prova final) e o número de faltas para eu armazenar\n;");
        int option = input.nextInt();
        while (option != 0) {
            if (option==1) {
                option1();
            }
            else if(option==2) {
                option2();
            }
            System.out.println("Digite uma das opções à seguir para lhe responder o que desejas:\n" +
            "Opção 0: Sair;\n" +
            "Opção 1: Passe-me seu nome/idade e lhe direi quais exigências para viajar de Ônibus Interestadual;\n" +
            "Opção 2: Diga-me sua nota PRELIMINAR do semestre (antes da prova final) e o número de faltas para eu armazenar\n;");    
            option = input.nextInt();
        }
        System.out.println("Esta opção é inválida!" +
                "Digite uma das opções à seguir para lhe responder o que desejas:\n" +
                "Opção 0: Sair;\n" +
                "Opção 1: Passe-me seu nome/idade e lhe direi quais exigências para viajar de Ônibus Interestadual;\n" +
                "Opção 2: Diga-me sua nota PRELIMINAR do semestre (antes da prova final) e o número de faltas para eu armazenar\n;");
	}
}
