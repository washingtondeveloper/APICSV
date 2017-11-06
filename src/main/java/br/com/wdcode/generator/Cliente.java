package br.com.wdcode.generator;

public class Cliente {

	private String nome;
	private String email;
	private Integer idade;
	private Boolean status;

	public Cliente(String nome, String email, Integer idade, Boolean status) {
		this.nome = nome;
		this.email = email;
		this.idade = idade;
		this.status = status;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

}
