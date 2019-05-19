import java.util.Scanner;
//import java.io; biblioteca geral
public class Main {
	
	public static void main(String[] args) {
		Vetores vetores;
		vetores = new Vetores();
		int x[] = new int[5];
 		int y[] = new int[6];
		
		vetores.leVetores(x,y);		
		vetores.comparaVetores(x,y);
	}
}
	
