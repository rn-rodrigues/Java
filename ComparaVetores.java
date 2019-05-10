import java.util.Scanner;

public class Vetores {
    
    public class Comparacao {
        public boolean compararVetor (int x[], int y[]) {
            boolean eIgual = true;
            int i = 0;
            if (x.length != y.length) {
                eIgual = false;
            }
            while (eIgual && i < x.length) {
                if(x[i] != y[i]) {
                    eIgual = false;
                }
                i++;
            }
            
            if (eIgual) {
                return true; //Vetores Iguais
            }
            else {
                return false; //Vetores diferentes
            }
        }
    }
    
    public static void main(String[] args) {
		int x[];
		int y[];
		Scanner input = new Scanner(System.in);      
		System.out.println("Digite os elementos do Vetor x: " + "\n");
        x = new int[input];
    
        System.out.println("Idade: "+"\n");             //Leitura da Idade da Pessoa
        int idade = input.nextInt();
		Scanner x = new Scanner (System.in);
		Vetores vetores = new Vetores();
		Comparacao cVetor = vetores.new Comparacao();
		boolean testeDeComparacao = cVetor.compararVetor(int x[], int y[]);
		
	}
}
