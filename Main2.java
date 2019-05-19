import java.util.Scanner;
//import java.io; biblioteca geral
public class Main2 {
	
	public static void main(String[] args) {
		Funcionario funcionarios[];
		funcionarios = new Funcionario[5];
		int i;
		for (i=0; i<funcionarios.length; i++) {
			String input;
			input = new String();
			
			String input1;
			input1 = new String();
			
			Scanner ler = new Scanner (System.in);
			System.out.println("Nome do funcionario "+(i+1)+":");
			
			input = ler.nextLine();
			funcionarios[i].setNome(input);

			System.out.println("CPF do funcionario "+(i+1)+":");
			
			input1 = ler.nextLine();
			funcionarios[i].setCpf(input1);
		}
	}
}
