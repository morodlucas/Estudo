package util;

import javax.swing.JOptionPane;
import setor.Setor;
import setor.SetorBebidas;
import setor.SetorComidas;
import java.util.ArrayList;
import java.util.List;

public class Util {
	private List<Setor> setores;

	public Util() {
		setores = new ArrayList<>();
	}
	
	public void app() {
		while (true) {
			String escolha = JOptionPane.showInputDialog(
					"Escolha uma opção:\n1. Cadastrar Setor\n2. Pesquisar Setor\n3. Alterar Setor\n4. Remover Setor\n5. Listar Setores\n6. Sair");

			try {
				switch (escolha) {
				case "1":
					cadastrarSetor();
					break;
				case "2":
					pesquisarSetor();
					break;
				case "3":
					alterarSetor();
					break;
				case "4":
					removerSetor();
					break;
				case "5":
					listarSetores();
					break;
				case "6":
					JOptionPane.showMessageDialog(null, "Programa encerrado.");
					System.exit(0);
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida!");
					break;
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Ocorreu um erro. Voltando à tela inicial.");
			}
		}
	}

	public void cadastrarSetor() {
		int ID = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do setor:"));
		String localizacao = JOptionPane.showInputDialog("Digite a localização do setor (Estado):");
		double capacidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a capacidade de produtos do setor:"));

		String tipoSetor = JOptionPane.showInputDialog("Digite o tipo de setor (1 - Comidas, 2 - Bebidas):");
		if (tipoSetor.equals("1")) {
			double quilosArmazenados = Double
					.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de quilos armazenados:"));
			SetorComidas setorComidas = new SetorComidas(ID, localizacao, capacidade, quilosArmazenados);
			setores.add(setorComidas);
		} else if (tipoSetor.equals("2")) {
			double litrosArmazenados = Double
					.parseDouble(JOptionPane.showInputDialog("Digite a quantidade de litros armazenados:"));
			SetorBebidas setorBebidas = new SetorBebidas(ID, localizacao, capacidade, litrosArmazenados);
			setores.add(setorBebidas);
		}

		JOptionPane.showMessageDialog(null, "Setor cadastrado com sucesso!");
	}

	public void pesquisarSetor() {
		int ID = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do setor a pesquisar:"));

		Setor encontrado = null;
		for (Setor setor : setores) {
			if (setor.getID() == ID) {
				encontrado = setor;
				break;
			}
		}

		if (encontrado != null) {
			JOptionPane.showMessageDialog(null, "Setor encontrado:\nID: " + encontrado.getID() + "\nLocalizacao: "
					+ encontrado.getLocalizacao() + "\nCapacidade: " + encontrado.getCapacidade());
			if (encontrado instanceof SetorComidas) {
				SetorComidas setorComidas = (SetorComidas) encontrado;
				JOptionPane.showMessageDialog(null, "Quilos armazenados: " + setorComidas.getQuilosArmazenados());
			} else if (encontrado instanceof SetorBebidas) {
				SetorBebidas setorBebidas = (SetorBebidas) encontrado;
				JOptionPane.showMessageDialog(null, "Litros armazenados: " + setorBebidas.getLitrosArmazenados());
			}
		} else {
			JOptionPane.showMessageDialog(null, "Setor não encontrado.");
		}
	}

	public void alterarSetor() {
		int ID = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do setor a alterar:"));

		Setor encontrado = null;
		for (Setor setor : setores) {
			if (setor.getID() == ID) {
				encontrado = setor;
				break;
			}
		}

		if (encontrado != null) {
			String localizacao = JOptionPane.showInputDialog("Digite a nova localizacao do setor:");
			double capacidade = Double.parseDouble(JOptionPane.showInputDialog("Digite a nova capacidade do setor:"));

			encontrado.setLocalizacao(localizacao);
			encontrado.setCapacidade(capacidade);

			JOptionPane.showMessageDialog(null, "Setor alterado com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null, "Setor não encontrado.");
		}
	}

	public void removerSetor() {
		int ID = Integer.parseInt(JOptionPane.showInputDialog("Digite o ID do setor a remover:"));

		Setor encontrado = null;
		for (Setor setor : setores) {
			if (setor.getID() == ID) {
				encontrado = setor;
				break;
			}
		}

		if (encontrado != null) {
			setores.remove(encontrado);
			JOptionPane.showMessageDialog(null, "Setor removido com sucesso!");
		} else {
			JOptionPane.showMessageDialog(null, "Setor não encontrado.");
		}
	}

	public void listarSetores() {
		String listaSetores = "";

		double totalQuilos = 0;
		double totalLitros = 0;

		for (Setor setor : setores) {
			listaSetores += "ID: " + setor.getID() + "\n";
			listaSetores += "Localização: " + setor.getLocalizacao() + "\n";
			listaSetores += "Capacidade de produtos: " + setor.getCapacidade() + "\n";

			if (setor instanceof SetorComidas) {
				SetorComidas setorComidas = (SetorComidas) setor;
				listaSetores += "Quilos Armazenados: " + setorComidas.getQuilosArmazenados() + "\n";
				totalQuilos += setorComidas.getQuilosArmazenados();
			} else if (setor instanceof SetorBebidas) {
				SetorBebidas setorBebidas = (SetorBebidas) setor;
				listaSetores += "Litros Armazenados: " + setorBebidas.getLitrosArmazenados() + "\n";
				totalLitros += setorBebidas.getLitrosArmazenados();
			}

			listaSetores += "\n";
		}

		listaSetores += "Total de Quilos: " + totalQuilos + "\n";
		listaSetores += "Total de Litros: " + totalLitros;

		JOptionPane.showMessageDialog(null, "Lista de Setores Cadastrados:\n\n" + listaSetores);
	}
	
}
