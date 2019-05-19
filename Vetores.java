import java.util.Scanner;
//import java.io; biblioteca geral
public class Vetores {
	
	public void leVetores(int x[], int y[]) {
		int i = 0;
		for(i=0; i<x.length; i++) {
			Scanner ler = new Scanner(System.in);
			System.out.println("Digite um valor para a posição " + (i+1) + " do vetor x:" + "\n");   
   			x[i] = ler.nextInt();
		}
		for (i=0; i<y.length; i++) {
			Scanner ler = new Scanner(System.in);
			System.out.println("Digite um valor para a posição" + (i+1) + "do vetor y:" + "\n");   
   			y[i] = ler.nextInt();
		}
	}
	public boolean comparaVetores (int[] x, int[] y) {
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
				System.out.println("Vetores Iguais");
                return true; //Vetores Iguais
            }
            else {
                System.out.println("Vetores diferentes");
				return false; //Vetores diferentes
            }
	}
	
}
		
	
