package feedback;

import produto.Produto;

public class Feedback {
	
	private String tipoFeedback;
	private String conteudoTexto;
	private Produto produto;

	public String getTipoFeedback() {
		return tipoFeedback;
	}

	public void setTipoFeedback(String tipoFeedback) {
		this.tipoFeedback = tipoFeedback;
	}

	public String getConteudoTexto() {
		return conteudoTexto;
	}

	public void setConteudoTexto(String conteudoTexto) {
		this.conteudoTexto = conteudoTexto;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	

}
