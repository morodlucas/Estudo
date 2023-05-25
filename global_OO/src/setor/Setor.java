package setor;

public class Setor {
	private int ID;
	private String localizacao;
	private double capacidade;

	public Setor(int ID, String localizacao, double capacidade) {
		this.ID = ID;
		this.localizacao = localizacao;
		this.capacidade = capacidade;
	}

	public int getID() {
		return ID;
	}

	public String getLocalizacao() {
		return localizacao;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}

	public void setCapacidade(double capacidade) {
		this.capacidade = capacidade;
	}

	public double getCapacidade() {
		return capacidade;
	}
}
