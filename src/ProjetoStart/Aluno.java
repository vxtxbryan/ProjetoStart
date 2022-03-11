package ProjetoStart;

import java.util.Scanner;

public class Aluno {

	// CRIANDO ESTANCIA DO SCANNER PARA CAPTURAR DADOS
	static Scanner entrada = new Scanner(System.in);
	
	private String nome;
	private String idade;
	private String endereco;
	private String cpf;
	private String telefone;
	private String instituicao;
	private String turma;
	private String email;
	private String senha;


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getInstituicao() {
		return instituicao;
	}

	public void setInstituicao(String instituicao) {
		this.instituicao = instituicao;
	}

	public String getTurma() {
		return turma;
	}

	public void setTurma(String turma) {
		this.turma = turma;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public static Scanner getEntrada() {
		return entrada;
	}

	public static void setEntrada(Scanner entrada) {
		Aluno.entrada = entrada;
	}

	public static char getOpcoes() {
		return opcoes;
	}

	public static void setOpcoes(char opcoes) {
		Aluno.opcoes = opcoes;
	}

	public void cadastrarAluno() {
		System.out.println("Digite seu nome: ");
		setNome(entrada.next());
		System.out.println("Digita sua idade: ");
		setIdade(entrada.next());
		System.out.println("Digite o CPF: ");
		setCpf(entrada.next());
		System.out.println("Digite o endereço: ");
		setEndereco(entrada.next());
		System.out.println("Digite o telefone: ");
		setTelefone(entrada.next());
		System.out.println("Informe sua instituição: ");
		setInstituicao(entrada.next());
		System.out.println("Informe sua turma: ");
		setTurma(entrada.next());
		System.out.println("Digite seu email (Será utilizado para fazer o login): ");
		setEmail(entrada.next());
		System.out.println("Digite sua senha: ");
		setSenha(entrada.next());
		Main.menuPrincipal();
		
	}

	public void exibirAluno() {
		System.out.println("Nome:" + getNome());
		System.out.println("Idade:" + getIdade());
		System.out.println("CPF:" + getCpf());
		System.out.println("Endereço:" + getEndereco());
		System.out.println("Telefone:" + getTelefone());
		System.out.println("Instituição:" + getInstituicao());
		System.out.println("Turma:" + getTurma());
		System.out.println("Email:" + getEmail());
		System.out.println("Senha:" + getSenha());
	}

	

	// CRIANDO A VARIAL PARA GUARDA A OPCAO DIGITADA
	static char opcoes;

	// METODO PARA VALIDAR EMAIL E SENHA
	void verificarLogin() {

		boolean usuarioLogado = false;

		// CASO O USUARIO DIGITAR EMAIL OU SENHA INVALIDAS, RETORNA A MENSAGEM
		while (usuarioLogado == false) {

			// CAPUTANDO EMAIL E SENHA DIGITADO
			System.out.println("----------------");
			System.out.println("     LOGIN      ");
			System.out.println("----------------");
			System.out.println("Digite seu email");
			String digitadoSsuario = entrada.next();

			System.out.println("Digite sua senha");
			String digitadoSenha = entrada.next();

			String _email = email;
			String _senha = senha;

			// UTILIZANDO O EQUALS PARA COMPARA SE A VARIAVEL E IGUAL AO VALOR DIGITADO
			if (digitadoSsuario.equals(_email) && digitadoSenha.equals(_senha)) {
				// CASO O USUARIO DIGITAR EMAIL E SENHA CORRETAS, APRENSAR O SISTEMA LOGADO
				System.out.println("Login realizado com sucesso");
				System.out.println("\n");
				exibirMenuLogin();
				usuarioLogado = true;
			} else {
				// SE O USUARIO DIGITAR EMAIL OU SENHA INVALIDOS, APRESENTAR MENSAGEM E CAPTURAR
				// NOVAMENTE
				System.out.println("Email ou senha invalidos!");
				System.out.println("Tente novamente [2] ou faça seu cadastro [1].");
				Main.menuPrincipal();
				usuarioLogado = false;
			}
		}
	}

	// METODO PARA EXIBIR MENU DEPOIS QUE O USUARIO LOGAR NO SISTEMA
	void exibirMenuLogin() {
		do {
			System.out.println();
			System.out.println("Selecione a opção desejada:");
			System.out.println("[1] - Minhas informações");
			System.out.println("[2] - Pacotes");
			System.out.println("[3] - Sair");
						
			Pacote pac = new Pacote();
			
			// CAPTURANDO VALOR DIGITADO NO CONSOLE
			opcoes = entrada.next().charAt((0));

			switch (opcoes) {
			case '1':
				exibirAluno();
				break;
			case '2':
				pac.conhecerPacote();
				break;
			case '3':
				System.out.println("Saindo do sistema");
				System.exit(0);
				break;
			default:
				System.out.println("Opção inválida");
			}

		} while (opcoes != '2' && opcoes != '3');
	}
	

}
