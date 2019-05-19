import java.util.Scanner;
public class Main2 {

	public void start() {
 		Funcionario[] funcionarios;
		funcionarios = new Funcionario[5];	
		int i=0;
		for (i=0; i<funcionarios.length; i++) {
			Scanner ler = new Scanner (System.in);
			System.out.println("Nome do funcionario "+(i+1)+":");
			String nome = ler.nextLine();

			System.out.println("CPF do funcionario "+(i+1)+":");
			String cpf = ler.nextLine();

			funcionarios[i] = new Funcionario(nome, cpf);
		}
	}
	
	public static void main(String[] args) {
		Main2 programa = new Main2();
		programa.start();
	}
}
