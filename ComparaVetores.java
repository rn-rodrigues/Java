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
		String fim = new String("fim");
		int i=0;
		while (fim != "fim") {
		    Scanner tamanho = new Scanner(System.in);
		    
		    System.out.println("Qual tamanho do vetor x?:");
		    int tamX = tamanho.nextInt();
		    int x[] = new int[tamX];
		    
		    System.out.println("Qual tamanho do vetor y?:");
		    int tamY = tamanho.nextInt();
		    int y[] = new int[tamY];

            Scanner input = new Scanner(System.in);		          
		    System.out.println("Digite" + i+1 + "º" + "dos elementos do Vetor x: " + "\n");
            x[i] = input.nextInt();
            
            System.out.println("Digite" + i+1 + "º" + "dos elementos do Vetor y: " + "\n");
            y[i] = input.nextInt();
            i++;
            
            System.out.println("Fim dos vetores ?");
            String fim = input.nextLine();
		}
		Vetores vetores = new Vetores();
		Comparacao cVetor = vetores.new Comparacao();
		boolean testeDeComparacao = cVetor.compararVetor(int x[], int y[]);
	}
}
