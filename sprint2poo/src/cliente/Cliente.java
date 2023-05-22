package cliente;

import feedback.Feedback;
import produto.Produto;

public class Cliente {

	private String nome;
	private String cpf;
	private int idade;
	private String sexo;
	private String estado;
	private Feedback feedback;
	private Produto produto;
	
	public String getEstado() {
		return estado;
	}
	
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDadosFeedback() {
		return "Tipo: " + feedback.getTipoFeedback()+ "\n"+
		"Produto: " + produto.getNomeProduto()+ "\n"+
		"Conteúdo: " + feedback.getConteudoTexto();
	}
	
	public Produto getProduto() {
		return produto;
	}
	
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	
	public Feedback getFeedback() {
		return feedback;
	}

	public void setFeedback(Feedback feedback) {
		this.feedback = feedback;
	}
	
}
