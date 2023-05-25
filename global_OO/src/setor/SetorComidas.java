package setor;

public class SetorComidas extends Setor {
	private double quilosArmazenados;

	public SetorComidas(int ID, String localizacao, double capacidade, double quilosArmazenados) {
		super(ID, localizacao, capacidade);
		this.quilosArmazenados = quilosArmazenados;
	}

	public double getQuilosArmazenados() {
		return quilosArmazenados;
	}
}
