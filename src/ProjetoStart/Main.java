package ProjetoStart;

import java.util.Scanner;

public class Main {

    // ESTANCIANDO CLASSE CLIENTE
    static Aluno alu = new Aluno();
    static Contato con = new Contato();

    // VARIAL PARA PEGAR A OPCAO DIGITADA
    static char opcoes;

    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {

        // TELA INCIAL DO SISTEMA
        System.out.println("=====================================");
        System.out.println("=              START                =");
        System.out.println("=     A melhor viagem de formatura  =");
        System.out.println("=====================================");

        menuPrincipal();

    }

    // METODO PARA CHAMAR MENU PRINCIAL
    public static void menuPrincipal() {
        // MENU PRINCIPAL UTILIZANDO O DO WHILE PARA FICAR REPETINDO ENQUANTO O USUARIO
        // NAO DIGITAR OPCAO CORRETA

        do {
            System.out.println();
            System.out.println("\n");
            System.out.println("Seja bem vindo a START! Insira a opcao desejada");
            System.out.println("[1] - Realizar Cadastro");
            System.out.println("[2] - Efetuar Login");
            System.out.println("[3] - Dúvida? Entre em contato");
            System.out.println("[4] - Sobre a Start");
            System.out.println("[5] - Sair");
            
            //CAPTURANDO OPCAO DIGITADA NO CONSOLE
            opcoes = entrada.next().charAt((0));

            switch (opcoes) {
            case '1':
                // CHAMAR O METODO CADASTRAR ALUNO NA CLASSE ALUNO
                alu.cadastrarAluno();
                System.out.println("\nRealize o login para acessar a plataforma. ");
                break;
            case '2':
                //CHAMANDO METODO DA CLASSE USUARIO PARA VERIFICAR SE O USUARIO EXISTE
                alu.verificarLogin();
                break;
            case '3':
                //CHAMANDO METODO PARA PREENCHER FORMULARIO DE CONTATO
                con.formContato();
                break;
            case '4':
            	System.out.println("---------------------------------------------------------------------------");
				System.out.println("                            SOBRE A START                        ");
				System.out.println("---------------------------------------------------------------------------");
				System.out.println("=  A Start é  um aplicativo focado em facilitar e transformar             = \n"
						+ "=  a sua experiência pós formatura, pois, sabemos o quão importante       =\n"
						+ "=  e marcante esse momento é na vida dos formandos, seja no ensino médio  =\n"
						+ "=  ou superior.  ");
				System.out.println("---------------------------------------------------------------------------");
				break;
            case '5':
            	//ENCERRANDO SISTEMA
                System.out.println("Sistema encerrado");
                System.exit(0);
                break;
            default:
                System.out.println("Opcao invalida");
            }

            //CASO O USUARIO ESCOLHER A OPCAO INCORRETA OU NAO CONSEGUIR LOGAR, APRESENTAR O MENU NOVAMENTE
        } while ( opcoes != '1' && opcoes != '2');

        //FECHANDO O SCANNER
        entrada.close();
    }
    
	

}