import java.util.Scanner;

public class Main2 {

	public void status(Funcionario[] funcionarios){
		
		System.out.println("Foi");
		for(int i = 0; i<funcionarios.length; i++){
			System.out.println(funcionarios[i].toString());
		}
	
	}

	public void start() {
 		Funcionario[] funcionarios;
		funcionarios = new Funcionario[2];
		String nome, cpf;	
		int i=0;
		Scanner ler = new Scanner (System.in);
		for (i=0; i<funcionarios.length; i++) {
			funcionarios[i] = new Funcionario();			
			
			System.out.println("Nome do funcionario "+(i+1)+":");
			nome = ler.nextLine();
			funcionarios[i].setNome(nome);

			System.out.println("CPF do funcionario "+(i+1)+":");
			cpf = ler.nextLine();
			funcionarios[i].setCpf(cpf);

			//funcionarios[i] = new Funcionario(nome, cpf);
			System.out.println("Número de dependentes: "+(i+1)+":");
			int nDependentes =ler.nextInt();
			
			Funcionario[] dependentes;	
			dependentes = new Funcionario[nDependentes];			

			while(nDependentes != 0){
				int j=0;
				dependentes[j] = new Funcionario();
				System.out.println("Nome do dependente" + (j+1) + ":");
				nome = ler.nextLine();
				dependentes[j].setNome(nome);
				
				System.out.println("CPF do dependente" + (j+1) + ":");
				cpf = ler.nextLine();
				dependentes[j].setCpf(cpf);

				j++;
				nDependentes--;
				
				funcionarios[i].setDependentes(dependentes);
			}

		}
		
		status(funcionarios);
	}
	
	public static void main(String[] args) {
		Main2 programa = new Main2();
		programa.start();
	}
}
