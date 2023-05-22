package util;

import static java.lang.Integer.parseInt;

import static javax.swing.JOptionPane.*;

import produto.Produto;
import feedback.Feedback;
import cliente.Cliente;

public class Util {
	
	public void app() {
		
		Cliente cliente = new Cliente();
		Feedback feedback = new Feedback();
		Produto produto =  new Produto();
		
		cliente.setFeedback(feedback);
		cliente.setProduto(produto);
		
		int opcao;
		do {
			opcao = parseInt(showInputDialog(gerarMenu()));
			switch (opcao) {
			case 0:
				showMessageDialog(null, "Programa encerrado");
				break;
			case 1:
				String nome = showInputDialog("Nome do cliente: ");
				cliente.setNome(nome);
				String cpfId = showInputDialog("CPF: ");
				cliente.setCpf(cpfId);
				String sexualidade = showInputDialog("Sexo do cliente: ");
				cliente.setSexo(sexualidade);
				String anos = showInputDialog("Idade do cliente: ");
				cliente.setIdade(parseInt(anos));
				String lugar = showInputDialog("Estado residente: ");
				cliente.setEstado(lugar);
				int aux;
				do {
					aux = parseInt(showInputDialog("1 para reclamação / 2 para sugestão"));
					switch(aux) {
					case 1:
						feedback.setTipoFeedback("Reclamação");
						String nomeProduto = showInputDialog("Produto que será destinada a " + feedback.getTipoFeedback() + ": ");
						produto.setNomeProduto(nomeProduto);
						String reclamacao = showInputDialog("Conteúdo da mensagem: ");
						feedback.setConteudoTexto(reclamacao);
						break;
					case 2:
						feedback.setTipoFeedback("Sugestão");
						String nomeProduto2 = showInputDialog("Produto que será destinada a " + feedback.getTipoFeedback() + ": ");
						produto.setNomeProduto(nomeProduto2);
						String sugestao = showInputDialog("Conteúdo da mensagem: ");
						feedback.setConteudoTexto(sugestao);
						break;
					
					default:
						showMessageDialog(null, "Opção Inválida");
					}
				}while (aux != 1 && aux != 2);
				
				break;
			case 2:
				
				showMessageDialog(
						null, 
						"Nome do cliente: "+ cliente.getNome() + "\n" + 
						"CPF: " + cliente.getCpf()+ "\n" +
						"Sexo: " + cliente.getSexo() + "\n" + 
						"Idade: " + cliente.getIdade() + "\n" + 
						"Estado residente: " + cliente.getEstado() + "\n"+ 
						cliente.getDadosFeedback() + "\n"
				);
				
				break;
			default:
				showMessageDialog(null, "Opção Inválida");
			}

		} while (opcao != 0);
		
	}
	
	public String gerarMenu() {
		String aux = "Interface de avaliação Heinz®\n";
		aux += "1. Iniciar avaliação\n";
		aux += "2. Mostrar dados escritos\n";
		aux += "0. Encerrar programa\n";
		return aux;
	}

}
