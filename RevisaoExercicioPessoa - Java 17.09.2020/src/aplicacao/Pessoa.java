package aplicacao;

public class Pessoa {

	private String nome; //Atributos // 
	private String enderešo;
	private int telefone;
	private int idade;
	private char sexo;
	
	public Pessoa(String nome) { //Construtores 
		super();
		this.nome = nome;
	}

	public Pessoa(String nome, String enderešo) {
		super();
		this.nome = nome;
		this.enderešo = enderešo;
	}

	public Pessoa(String nome, String enderešo, int telefone) {
		super();
		this.nome = nome;
		this.enderešo = enderešo;
		this.telefone = telefone;
	}

	public Pessoa(String nome, String enderešo, int telefone, int idade) {
		super();
		this.nome = nome;
		this.enderešo = enderešo;
		this.telefone = telefone;
		this.idade = idade;
	}

	public Pessoa(String nome, String enderešo, int telefone, int idade, char sexo) {
		super();
		this.nome = nome;
		this.enderešo = enderešo;
		this.telefone = telefone;
		this.idade = idade;
		this.sexo = sexo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEnderešo() {
		return enderešo;
	}

	public void setEnderešo(String enderešo) {
		this.enderešo = enderešo;
	}

	public int getTelefone() {
		return telefone;
	}

	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	
	
	
}
