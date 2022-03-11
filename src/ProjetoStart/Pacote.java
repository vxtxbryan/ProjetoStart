package ProjetoStart;

import java.util.Scanner;

public class Pacote {

	// ATRIBUTOS
	private String destino;
	private String valores;
	private String refeicao;
	private String showsFestas;

	static char saibaMais;
	static char escolhaFinal;

	static Scanner leitor = new Scanner(System.in);
	static char opcoes;

	// M�TODOS
	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public String getValores() {
		return valores;
	}

	public void setValores(String valores) {
		this.valores = valores;
	}

	public String getRefeicao() {
		return refeicao;
	}

	public void setRefeicao(String refeicao) {
		this.refeicao = refeicao;
	}

	public String getShowsFestas() {
		return showsFestas;
	}

	public void setShowsFestas(String showsFestas) {
		this.showsFestas = showsFestas;
	}

	public String getHospedagem() {
		return hospedagem;
	}

	public void setHospedagem(String hospedagem) {
		this.hospedagem = hospedagem;
	}

	private String hospedagem;

	public void conhecerPacote() {

		System.out.println();
		System.out.println("Selecione a op��o desejada e saiba mais");
		System.out.println("[1] Bariloche");
		// criarPacote1();

		System.out.println("\n[2] Canc�n");
		// criarPacote2();

		System.out.println("\n[3] Florian�polis");
		// criarPacote3();

		saibaMais = leitor.next().charAt((0));

		switch (saibaMais) {
		case '1':
			criarPacote1();
			escolherPacote();
			break;
		case '2':
			criarPacote2();
			escolherPacote();
			break;
		case '3':
			criarPacote3();
			escolherPacote();
			break;
		default:
			System.out.println("Op��o inv�lida");
		}

	}

	public void escolherPacote() {
		System.out.println("Deseja escolher esse pacote?");
		System.out.println("[1] - Sim");
		System.out.println("[2] - N�o");
		escolhaFinal = leitor.next().charAt((0));

		switch (escolhaFinal) {
		case '1':
			System.out.println("\n******************************************************************************");
			System.out.println("Pacote escolhido com sucesso! Dirija - se a ag�ncia para realizar o pagamento.");
			System.out.println("\n******************************************************************************");
			
			Aluno alu = new Aluno();
			alu.exibirMenuLogin();
			
			break;
		case '2':
			System.out.println("\nRetornado ao menu anterior...");
			conhecerPacote();
		}

	}

	public void criarPacote1() {
		this.setDestino("Bariloche");
		this.setShowsFestas("Show do Alok");
		this.setHospedagem("Hotel Fazenda Para�so");
		this.setRefeicao("Caf� da manh� + Jantar");
		this.setValores("R$ 10.000,00");

		System.out.println("\n---------------------------------------------------------------------------------");
		System.out.println("Destino: " + this.getDestino());
		System.out.println("Show/Festa: " + this.getShowsFestas());
		System.out.println("Hospedagem: " + this.getHospedagem());
		System.out.println("Quais refei��es est�o inclusas no valor total do pacote? " + this.getRefeicao());
		System.out.println("Valor do seu pacote de viagem: " + this.getValores());
		System.out.println("\n---------------------------------------------------------------------------------");
		System.out.println();
	}

	public void criarPacote2() {
		this.setDestino("Canc�n");
		this.setShowsFestas("Festa na piscina");
		this.setHospedagem("Hotel Real");
		this.setRefeicao("Caf� da manh�");
		this.setValores("R$ 8.500,00");

		System.out.println("\n---------------------------------------------------------------------------------");
		System.out.println("Destino: " + this.getDestino());
		System.out.println("Show/Festa: " + this.getShowsFestas());
		System.out.println("Hospedagem: " + this.getHospedagem());
		System.out.println("Quais refei��es est�o inclusas no valor total do pacote? " + this.getRefeicao());
		System.out.println("Valor do seu pacote de viagem: " + this.getValores());
		System.out.println("\n---------------------------------------------------------------------------------");
		System.out.println();
	}

	public void criarPacote3() {
		this.setDestino("Florian�polis");
		this.setShowsFestas("Lual");
		this.setHospedagem("Hostel Floripa");
		this.setRefeicao("Caf� da manh�");
		this.setValores("R$ 9.500,00");

		System.out.println("\n---------------------------------------------------------------------------------");
		System.out.println("Destino: " + this.getDestino());
		System.out.println("Show/Festa: " + this.getShowsFestas());
		System.out.println("Hospedagem: " + this.getHospedagem());
		System.out.println("Quais refei��es est�o inclusas no valor total do pacote? " + this.getRefeicao());
		System.out.println("Valor do seu pacote de viagem: " + this.getValores());
		System.out.println("\n---------------------------------------------------------------------------------");
		System.out.println();
	}
	
	// PRIMEIRO MENU PACOTE
		void menuPacote() {
			do {
				System.out.println();
				System.out.println("Selecione a opcao desejada:");
				System.out.println("[1] - Escolha pacote desejado");
				System.out.println("[2] - Acesse seu pacote");
				System.out.println("[3] - Sair");
				
				// CAPTURANDO VALOR DIGITADO NO CONSOLE
			    opcoes = leitor.next().charAt((0));

				switch (opcoes) {
				case '1':
					break;
				case '2':
					conhecerPacote();
					break;
				case '3':
					System.out.println("Saindo do sistema");
					System.exit(0);
					break;
				default:
					System.out.println("Opcao invalida");
				}

			} while (opcoes != '1' && opcoes != '2');
		}

}
