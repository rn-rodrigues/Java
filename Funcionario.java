import java.util.Scanner;
public class Funcionario {
	private String nome;
	private String cpf;
	private Funcionario dependentes[];

	public Funcionario(String nome, String cpf) {
		this.nome = nome;
		this.cpf = cpf;
	}
	//GET e SET Nome
	public void setNome(String n) {
		nome = n;
	}
	public String getNome() {
		return nome;
	}
	//GET e SET CPF
	public void setCpf(String c) {
		cpf = c;
	}
	public String getCpf() {
		return cpf;
	}

}
