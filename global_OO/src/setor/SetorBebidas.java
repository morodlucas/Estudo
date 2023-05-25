package setor;

public class SetorBebidas extends Setor {
	private double litrosArmazenados;

	public SetorBebidas(int ID, String localizacao, double capacidade, double litrosArmazenados) {
		super(ID, localizacao, capacidade);
		this.litrosArmazenados = litrosArmazenados;
	}

	public double getLitrosArmazenados() {
		return litrosArmazenados;
	}
}
